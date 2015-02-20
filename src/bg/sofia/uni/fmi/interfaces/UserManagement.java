/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bg.sofia.uni.fmi.interfaces;

import bg.sofia.uni.fmi.user.User;
import java.io.Serializable;

/**
 *
 * @author vankata
 */
public interface UserManagement extends Serializable {
    
    public void addUser(String username, String password);
    
}
