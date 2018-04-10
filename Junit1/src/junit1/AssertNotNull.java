package junit1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertNotNull {
    
    @Test
    public void testAssertion() {
        
        String name1 = new String ("dragon");
        
        //Check that an object isn't null
        assertNotNull(name1);
    }
}
