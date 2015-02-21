/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bg.sofia.uni.fmi.user;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author vankata
 */
public class BankCard implements Serializable, Comparable<BankCard> {
    private String cardNumber;
    private String encryptedCardNumber;

   

    public BankCard(String cardNumber, String encryptedCardNumber) {
        setCardNumber(cardNumber);
        setEncryptedCardNumber(encryptedCardNumber);
    }
    
    
    public BankCard(BankCard bank){
        this(bank.cardNumber,bank.encryptedCardNumber);
    }

    public BankCard() {
        this("","");
    }
    
    public String getCardNumber() {
        String tmpNumber = cardNumber;
        return tmpNumber;
    }

    public void setCardNumber(String cardNumber) {
        if(cardNumber != null){
            this.cardNumber = cardNumber;
        }else{
            this.cardNumber = "";
        }
        
    }

    public String getEncryptedCardNumber() {
        String tmpEncrypted = encryptedCardNumber;
        return tmpEncrypted;
    }

    public void setEncryptedCardNumber(String encryptedCardNumber) {
        if(encryptedCardNumber == null){
            this.encryptedCardNumber = "";
        }
        else{
            this.encryptedCardNumber = encryptedCardNumber;
        }
        
    }

    @Override
    public int compareTo(BankCard o) {
       return this.getCardNumber().compareTo(o.getCardNumber());
    }

    @Override
    public String toString() {
        return String.format("Card number: %s\tEncrypted card number: %s\n", cardNumber,encryptedCardNumber);
    }
    
    
}
