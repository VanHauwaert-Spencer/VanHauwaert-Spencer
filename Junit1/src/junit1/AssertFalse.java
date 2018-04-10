package junit1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertFalse {
    
    @Test
    public void testAssertion() {
        
        int currentHealth = 5;
        int maximumHealth = 6;
        
        //Check that a condition is false
        assertFalse(currentHealth > maximumHealth);
    }
}
