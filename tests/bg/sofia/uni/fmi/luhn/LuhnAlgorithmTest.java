/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bg.sofia.uni.fmi.luhn;

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
public class LuhnAlgorithmTest {
    
    @Test
    public void testValidCardNumber(){
        assertEquals(true, LuhnAlgorithm.checkNumber("4929250824173844"));
    }
    
    @Test
    public void testInvalidCardNumber(){
        assertEquals(false, LuhnAlgorithm.checkNumber("79927398711"));
    }
    
    @Test
    public void testNullPointerRefference(){
        assertEquals(false, LuhnAlgorithm.checkNumber(null));
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
