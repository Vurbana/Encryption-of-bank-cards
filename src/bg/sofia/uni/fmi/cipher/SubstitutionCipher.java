/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bg.sofia.uni.fmi.cipher;

/**
 *
 * @author vankata
 */
public class SubstitutionCipher {
    private  int displacement = 5;
    public  String encrypt(String cardNumber){
        char[] digits = cardNumber.toCharArray();
        char[] encryptedDigits = new char[digits.length];
        int d;
        
        for (int i = 0; i < digits.length; i++) {
            d = Character.digit(digits[i],10);
            d = (d + displacement)%10;
            encryptedDigits[i] = Character.forDigit(d, 10);
                    }
        return new String(encryptedDigits);
    }
    public  String decrypt(String cardNumber){
        char[] digits = cardNumber.toCharArray();
        char[] decryptedDigits = new char[digits.length];
        int d;
        for (int i = 0; i < digits.length; i++) {
            d = Character.digit(digits[i],10);
            if(d < displacement){
                d = (10+d-displacement);
            }
            else{
                d = d - displacement;
            }
            decryptedDigits[i] = Character.forDigit(d, 10);
                    
        }
        return new String(decryptedDigits);
    }
}
