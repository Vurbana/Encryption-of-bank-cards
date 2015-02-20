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
    public boolean isValidUser(String username) throws RemoteException;
    public void encrypt(String  cardNumber) throws RemoteException;
    public void decrypt(String number) throws RemoteException;
}
