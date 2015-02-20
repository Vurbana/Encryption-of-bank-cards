/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bg.sofia.uni.fmi.cipher;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vankata
 */
public class SubstitutionCipherTest {
    private SubstitutionCipher cipher;
   
    
    
    
    @Before
    public void setUp() {
       cipher  = new SubstitutionCipher();
    }
    
    @Test
    public void testEcnryption(){
        String number = "4563960122001999";
        assertEquals("9018415677556444", cipher.encrypt(number));
    }
    @Test
    public void testDecryption(){
        String number = "9018415677556444";
        assertEquals("4563960122001999", cipher.decrypt(number));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
