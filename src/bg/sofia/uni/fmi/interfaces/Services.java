/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bg.sofia.uni.fmi.interfaces;

import bg.sofia.uni.fmi.user.User;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author vankata
 */
public interface Services extends Remote{
    public boolean isValidUser(String username, String password) throws RemoteException;
    public String encrypt(String  cardNumber) throws RemoteException;
    public String decrypt(String number) throws RemoteException;
    public boolean checkUsername(String username) throws RemoteException;
    public User getUser(String username) throws RemoteException;
    public boolean isValidCardNumber(String cardNumber) throws RemoteException;
    public void updateCardNumber(String username, String cardNumber) throws RemoteException;
    public void updateEncryptedCardNumber(String username, String encryptedNumber) throws RemoteException;
}
