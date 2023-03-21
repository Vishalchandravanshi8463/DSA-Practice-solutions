
public class Recursion2 {
    public static void main(String[] args) {
        int n=5;
        reverse(n);
       // System.out.print(vishal(n)+" ");
        System.out.println("");
       funrev(n);
    }
    static void reverse(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
       
        reverse(n-1);
    } 
 static void funrev(int n)
 {
     if(n==0)
     {
         return ;
     }
    funrev(n-1);
     System.out.print(n+" ");
      System.out.println("trrhtghfgb");
 }
}
