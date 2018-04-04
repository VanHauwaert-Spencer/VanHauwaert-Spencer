package mvc3;


public class MVC3 {

    
    public static void main(String[] args) {
        
  Model m = new Model("");
  View v = new View("MVC Example");
  Controller c = new Controller(m, v);
  c.initController();
 }
        
}
