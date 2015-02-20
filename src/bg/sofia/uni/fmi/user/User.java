/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bg.sofia.uni.fmi.user;

import java.io.Serializable;

/**
 *
 * @author vankata
 */
public class User implements Serializable {
    
    private String username;
    private String password;
    

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
        
    }

    
    public String getUsername() {
        String tmpUsername = username;
       
        return tmpUsername;
    }

    public void setUsername(String username) {
        if(username != null){
            this.username = username;
        }
        else{
            this.username = "John Doe";
        }
        
    }

    public String getPassword() {
        String tmpPassword = password;
        return tmpPassword;
    }

    public void setPassword(String password) {
        if(password != null){
            this.password = password;
        }
        else{
            this.password = "0000";
        }
        
        
    }

    
    
    
}
