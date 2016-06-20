
package SandboxCode;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jae Dillree
 */
public class JUnitAssertTest {
    
    public JUnitAssertTest() {
    }
    

    /**
     * Test of add method, of class JUnitAssert.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int one = 6;
        int two = 5;
        JUnitAssert instance = new JUnitAssert();
        int expResult = 11;
        int result = instance.add(one, two);
        assertEquals(expResult, result);
    }
    
}
