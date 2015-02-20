/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bg.sofia.uni.fmi.luhn;

/**
 *
 * @author vankata
 */
public class LuhnAlgorithm {
    public static boolean checkNumber(String number){
         if (number == null) {
            return false;
        }

        int s1 = 0, s2 = 0;
        String reverse = new StringBuilder(number).reverse().toString();
        for (int i = 0; i < reverse.length(); i++) {
            int digit = Character.digit(reverse.charAt(i), 10);
            if (i % 2 == 0) {
                s1 += digit;
            } else {
                s2 += 2 * digit;
                if (digit >= 5) {
                    s2 -= 9;
                }
            }
        }
        return (s1 + s2) % 10 == 0;
    }
    }

