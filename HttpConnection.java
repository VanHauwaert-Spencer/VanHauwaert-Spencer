
import java.io.*;
import java.net.*;
import java.util.*;


public class HttpConnection{
    
    public static void main(String[] args) throws Exception {
        
                    
        URL url = new URL("https://www.lds.org");
    
        HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
    
        // Display request method
        System.out.println("Request method is: " + urlCon.getRequestMethod());
    
        // Display response code
        System.out.println("Response code is: " + urlCon.getResponseCode());
    
        // Display response message
        System.out.println("Response message is: " + urlCon.getResponseMessage()); 
    
        // Get a list of the header fields and a set of header keys
        Map<String, List<String>> urlMap = urlCon.getHeaderFields();
        Set<String> urlField = urlMap.keySet();
    
        System.out.println("\nHere is the header:");
    
        // Display all header keys and values
        for(String k : urlField){
            System.out.println("Key: " + k + " Value: " + urlMap.get(k));
        }
        urlCon.disconnect();
    
        
    
    }
}
