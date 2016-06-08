/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jae Dillree
 */
public class AssertTest {
    public void test(){
        int three = JUnitTest.addTest(7, 5);
        
        /* the first value in the assertEquals statement is what is actually
        ** expected, the second is the variable or whatever is pulled from the actual
        ** code, the third is the delta/difference permitted to account for things
        ** like float calculations
        */ 
        assertEquals(12, three, 0);

    }
}
   