/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bg.sofia.uni.fmi.server;

import bg.sofia.uni.fmi.cipher.SubstitutionCipher;
import bg.sofia.uni.fmi.interfaces.Services;
import bg.sofia.uni.fmi.interfaces.UserManagement;
import bg.sofia.uni.fmi.luhn.LuhnAlgorithm;
import bg.sofia.uni.fmi.user.User;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author vankata
 */
public class Server extends UnicastRemoteObject implements Services, UserManagement {
    private Map<String, User> map;

    public Map<String, User> getMap() {
        return map;
    }
    private SubstitutionCipher cipher;
    public Server() throws RemoteException
    {
        map = new TreeMap<String, User>();
        cipher = new SubstitutionCipher();
    }
    
  

    @Override
    public String encrypt(String cardNumber) throws RemoteException {
        return cipher.encrypt(cardNumber);
    }

    @Override
    public String decrypt(String number) throws RemoteException {
        return cipher.decrypt(number);
    }

   

    @Override
    public void addUser(String username, String password) {
        User user = new User(username,password);
        map.put(username, user);
        System.out.println(user);
    }

    @Override
    public boolean isValidUser(String username, String password) throws RemoteException {
        User user = map.get(username);
        
        if(user == null){
            return false;
        }
        else if(user.getPassword().equals(password))
        {
            return true;
        }
        return false;
    }
    public User getUser(String username) throws RemoteException{
        return map.get(username);
    }

    @Override
    public boolean checkUsername(String username) throws RemoteException {
        if(map.get(username)==null){
            return true;
        }
        return false;
    }

    @Override
    public void addUser(String username, String password, String permission) {
        User user = new User(username,password, permission);
        map.put(username, user);
        System.out.println(user);
    }

    @Override
    public boolean isValidCardNumber(String cardNumber) throws RemoteException {
        if(LuhnAlgorithm.checkNumber(cardNumber)){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void updateCardNumber(String username, String cardNumber) throws RemoteException {
       map.get(username).setCardNumber(cardNumber);
    }

    @Override
    public void updateEncryptedCardNumber(String username, String encryptedNumber) throws RemoteException {
        map.get(username).setEncryptedCardNumber(encryptedNumber);
    }
    
}
