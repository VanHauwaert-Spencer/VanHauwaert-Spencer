import java.util.*;

class JavaCollections {
    public static void main(String[] args) {
        
        System.out.println("ArrayList Example:");
        System.out.println();
        
        ArrayList<String> codes = new  ArrayList<>();
        
        codes.add("lotr");
        codes.add("star");
        codes.add(0, "dune");
        
        for (int i = 0; i < codes.size(); i++)
        {
            String code = codes.get(i);
            System.out.println(code);
        }
        
        System.out.println();
        
        System.out.println("ArrayList object replace & removal:");
        System.out.println();
        
        codes.set(1, "hung");
        codes.remove("dune");
        codes.remove(1);
        System.out.println(codes);
        System.out.println();
        
        
        System.out.println("LinkedList Example:");
        System.out.println();
        
        LinkedList<String> codes2 = new LinkedList<>();
        
        // add data
        codes2.add("lotr");
        codes2.add("star");
        codes2.add(0, "dune");
        
        System.out.println(codes2);
        System.out.println();
        System.out.println("LinkedList - adding new elements:");
        System.out.println();
        
        codes2.addFirst("hung");
        codes2.addLast("dive");;
        
        System.out.println(codes2);
        System.out.println();
        
        
        // Create a Queue object & add data nd display
        
        System.out.println("Queue Example:");
        System.out.println();
        
        GenericQueue<String> q1 = new GenericQueue<String>();
        q1.push("Lord of the Rings");
        q1.push("Dune");
        q1.push("Hunger Games");
        
        System.out.println("The queue contains " + q1.size() + " items");
        while (q1.size() > 0)
            System.out.println(q1.pull());
        System.out.println("The queue now contains " + q1.size() + " items");
        System.out.println();
        
           
        // Create a hashmap
        
        System.out.println("HashMap Example:");
        System.out.println();
        
        HashMap<String, Double> hm = new HashMap<String, Double>();
               
        // Put elements to the map
        hm.put("J.R.R Tolkin", new Double(4285.66));
        hm.put("Frank Herbert", new Double(123.45));
        hm.put("Suzanne Summers", new Double(1529.00));
        hm.put("George Lucas", new Double(66.88));
        hm.put("Veronica Roth", new Double(-45.08));
                
        // Get a set of the entries
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        
        // Display the set
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        
        System.out.println();
        
        // Deposit 1000 into John Doe's account
        double balance = hm.get("J.R.R Tolkin");
        hm.put("J.R.R Tolkin", balance + 3000);
        
        System.out.println("J.R.R Tolkin's new balance: " + 
                hm.get("J.R.R Tolkin"));
        
        
        // Create a TreeMap
        
        System.out.println();
        System.out.println("TreeMap Example:");
        System.out.println();
        
        TreeMap<String,String> books = new TreeMap<>();
        
        // add three entries
        books.put("lotr", "Lord of the Rings");
        books.put("hung", "Hunger Games");
        books.put("dive", "Divergent");
        
        // print the entries
        for (Map.Entry book : books.entrySet())
            System.out.println(book.getKey() + ": " + book.getValue());
        
        // print the entry whose key is "mbdk"
        System.out.print("\nCode lotr is " + books.get("lotr"));
        System.out.println();
        
        
        // Create a TreeSet
        
        
        System.out.println("TreeSet Example:");
        System.out.println();
        
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        
        System.out.println(ts);
        System.out.println();
        
    
        // Create a HashSet
        
        
        System.out.println("HashSet Example:");
        System.out.println();
        
        HashSet<String> hs = new HashSet<String>();
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");
        
        System.out.println(hs);
        
        
    }
}