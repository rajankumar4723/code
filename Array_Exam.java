import java.lang.Thread.State;

public class Array_Exam {
    /**
     * @param a
     * @param n
     * @param start
     * @param end
     */
    public static void reversArray(int a[],int start,int end) {
        int temp=0;
        while (start<end) {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
            
        }
    }
    public static void print(int a[],int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(" "+a[i]);
            
        }System.out.println();
        
    }
    public static void main(String[] args) {
        
         int a[]={1,2,3,4,5,6};
         print(a, 5);
         System.out.println("Reverse array");
         reversArray(a, 0, 5);
         print(a, 5);
         if(S)

        // int n=6;

        // for (int i : a) {
        // System.out.print(" "+i);
            
        // }
        // System.out.println();
           
    }

    
}
