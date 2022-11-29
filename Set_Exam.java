import java.util.HashSet;
import java.util.Iterator;
//import java.util.*;

public class Set_Exam {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        HashSet<String>s=new HashSet<String>();
        s.add("rajan");
        s.add("HHHH");
        System.out.println(s);

        //Size find
        System.out.println(s.size());

        if(s.contains("rajan")){
            System.out.println("present");
        }else{
            System.out.println("not parsent");
        }

        Iterator<String>i=s.iterator();
        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }

        //loop used
        for(String h:s){
            System.out.println(h);
        }
        
    }
}
