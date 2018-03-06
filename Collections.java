import java.util.ArrayList;

public class Collections {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> testCollection = new ArrayList<Integer>();
        // List of numbers
        
        testCollection.add(12);
        testCollection.add(33);
        testCollection.add(45);
        testCollection.add(69);
        
        System.out.println(testCollection);
        
        testCollection.remove(1);
        
        System.out.println(testCollection);
        
    }
}