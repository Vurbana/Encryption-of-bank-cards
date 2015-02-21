/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bg.sofia.uni.fmi.xmlWritter;

import bg.sofia.uni.fmi.user.User;
import com.thoughtworks.xstream.XStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vankata
 */
public class UsersDB {
    public void updateXML(Map<String,User> map){
        ArrayList<User> usersList = new ArrayList<User>();
        for (Map.Entry<String, User> entry: map.entrySet()) {
            usersList.add(entry.getValue());
        }
        XStream xstream = new XStream();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("users.xml")))){
            xstream.toXML(usersList, bw);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public void updateServerMap(Map<String, User> map){
        ArrayList<User> usersList = new ArrayList<User>();
        String rawXML;
        XStream xstream = new XStream();
        StringBuilder sb = new StringBuilder();
        try(Scanner input = new Scanner(new BufferedReader(new FileReader(new File("users.xml"))))){
            while(input.hasNext()){
                sb.append(input.nextLine());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        rawXML = sb.toString();
        usersList = (ArrayList<User>)xstream.fromXML(rawXML);
        for(User user:usersList){
            map.put(user.getUsername(), user);
        }
    }
}
