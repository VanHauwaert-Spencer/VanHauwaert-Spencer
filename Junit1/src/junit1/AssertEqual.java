package junit1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertEqual {
    
    @Test
    public void testAssertion() {
        
        String name1 = new String ("dragon");
        String name2 = new String ("dragon");
                
        //Check that two objects are equal
        assertEquals(name1, name2);
        
    }
}
