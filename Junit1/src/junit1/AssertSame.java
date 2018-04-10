package junit1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertSame {
    
    @Test
    public void testAssertion() {
        
        String name1 = "dragon";
        String name2 = "dragon";
        
        //Check if two object references point to the same object
        assertSame(name1,name2);
    }
}
