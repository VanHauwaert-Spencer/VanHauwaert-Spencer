package junit1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertNull {
    
    @Test
    public void testAssertion() {
        
        String name1 = null;
        
        //Check that an object is null
        assertNull(name1);
    }
}
