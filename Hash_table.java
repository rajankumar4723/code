import java.util.Hashtable;

public class Hash_table {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Hashtable<Integer,String>am=new Hashtable<Integer,String>();
        am.put(2, "Virat");
        am.put(4, "Sandeep Maheswari");
        am.put(1, "Elon");
        System.out.println(am);

        System.out.println(am.isEmpty());
        System.out.println(am.containsValue("Elon"));//true
        System.out.println(am.containsValue("We are great.."));//false
        System.out.println(am.replace(4, "Sandeep Maheswari", "Google"));//replace value
        System.out.println(am);


    }
}
