package junit1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Junit1 {
   public static void main(String[] args) {
        Result result1 = JUnitCore.runClasses(AssertEqual.class);
        Result result2 = JUnitCore.runClasses(AssertTrue.class);
        Result result3 = JUnitCore.runClasses(AssertFalse.class);
        Result result4 = JUnitCore.runClasses(AssertNotNull.class);
        Result result5 = JUnitCore.runClasses(AssertNull.class);
        Result result6 = JUnitCore.runClasses(AssertSame.class);
		
      for (Failure failure : result1.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result1.wasSuccessful());
      
      for (Failure failure : result2.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result2.wasSuccessful());
      
      for (Failure failure : result3.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result3.wasSuccessful());
      
      for (Failure failure : result4.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result4.wasSuccessful());
      
      for (Failure failure : result5.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result5.wasSuccessful());
      
      for (Failure failure : result6.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result6.wasSuccessful());
   }
} 
