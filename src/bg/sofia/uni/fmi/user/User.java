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
    private String permission;

   
    

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
        setPermission("");
        
    }

    public User(String username, String password, String permission) {
        setPassword(password);
        setUsername(username);
        setPermission(permission);
    }

    public User() {
        this("John Doe", "0000","none");
    }
    
    public User(User user){
        this(user.username,user.password,user.permission);
    }

    public String getPermission() {
        String tmpPermission = permission;
        return tmpPermission;
        
    }

    public void setPermission(String permission) {
        if(permission == null || permission.equals("")){
            this.permission = "none";
        }
        else{
            this.permission = permission;
        }
    }

    
    public String getUsername() {
        String tmpUsername = username;
       
        return tmpUsername;
    }

    public void setUsername(String username) {
        if(username != null ){
            this.username = username;
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

    
     @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + '}';
    }
    
}
