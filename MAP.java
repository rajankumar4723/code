//import java.util.HashMap.*;
import java.util.HashMap;
import java.util.Map;

class MAP
{
    /**
     * @param args
     */
    public static void main(String[] args) {
         HashMap<String,Integer>m=new HashMap<>();

        m.put("Geeks ",10);
        System.out.println(m);

        m.put("gfg", 10); 
        m.put("ide", 15); 
        m.put("courses", 20); 

        // Print size and content
        System.out.println(m); 
        System.out.println(m.size()); 

       
        
       // Iterating over HashMap 
        for(Map.Entry<String, Integer>e : m.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}