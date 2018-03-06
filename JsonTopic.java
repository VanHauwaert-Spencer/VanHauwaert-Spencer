package com.van.json;

import java.util.*;
import org.json.simple.*;
//import org.json.*;



class JsonTopic {
    
    private static void writeJSON(){
    
        Map obj=new HashMap();
        obj.put("Customer","Fred's Chocolates");
        obj.put("ID",new Integer(85926));
        obj.put("Balance",new Double(5439.54));
        String jsonText = JSONValue.toJSONString(obj);
        System.out.println("JSON encoding with HashMap:");
        System.out.println(jsonText);
        System.out.println();
    }
    
    
    private static void readJSON() {
                
        // Convert JSON string to JSONObject
        String s="{\"Customer\":\"Fred's Chocolates\",\"Balance\":5439.54,\"ID\":85926}";
        Object obj=JSONValue.parse(s);
        JSONObject jsonObject = (JSONObject) obj;
  
        String customer = (String) jsonObject.get("Customer");
        double balance = (Double) jsonObject.get("Balance");
        long id = (Long) jsonObject.get("ID");
        
        System.out.println("JSON decoding:");
        System.out.println(customer+" "+balance+" "+id);
                
    }

   public static void main(String[] args){
      
        writeJSON();
        readJSON();
   }
}