package junit1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertTrue {
    
    @Test
    public void testAssertion() {
        
        int currentHealth = 7;
        int maximumHealth = 10;
        
        //Check that a condition is true
        assertTrue (currentHealth < maximumHealth);
    }
    
}
