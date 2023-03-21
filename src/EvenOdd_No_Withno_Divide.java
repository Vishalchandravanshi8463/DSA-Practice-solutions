
public class EvenOdd_No_Withno_Divide {
    public static void main(String[] args) {
        int a=40;
        
            System.out.println(isOdd(a));
        
    }
   static boolean isOdd(int a)
    {
        return (a&1)==1;
    }
}
