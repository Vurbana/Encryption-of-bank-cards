/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bg.sofia.uni.fmi.server;

import bg.sofia.uni.fmi.interfaces.Services;
import bg.sofia.uni.fmi.interfaces.UserManagement;
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
    public Server() throws RemoteException
    {
        map = new TreeMap<String, User>();
    }
    
  

    @Override
    public void encrypt(String cardNumber) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void decrypt(String number) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public boolean checkUsername(String username) throws RemoteException {
        if(map.get(username)==null){
            return true;
        }
        return false;
    }
    
}
