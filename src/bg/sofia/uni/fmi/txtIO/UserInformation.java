/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bg.sofia.uni.fmi.txtIO;


import bg.sofia.uni.fmi.user.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author vankata
 */
public class UserInformation {
    public static void generateUserInfo(Map<String, User> map) {
        try(Formatter formatter = new Formatter(new BufferedWriter(new FileWriter(new File("usersInfo.txt"))))){
            
            for (Map.Entry<String, User> entry: map.entrySet()) {
                formatter.format("%s",entry.getValue().toString());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static StringBuilder getUserInfo(){
        StringBuilder sb = new StringBuilder();
       try(Scanner input = new Scanner(new BufferedReader(new FileReader(new File("usersInfo.txt"))))){
           
           while(input.hasNext()){
             sb.append(input.nextLine()+"\n");
               
           }
       }catch(IOException e){
           e.printStackTrace();
       }
       return sb;
    }
}
