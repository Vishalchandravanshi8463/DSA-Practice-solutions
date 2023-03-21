
public class Function {
    public static void main(String[] args) {
        print(1);
        System.out.println(fib(7));
    }
    static int fib(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
   static void print (int n)
    {
        System.out.println(n);
        print1(2);
    }
   static void print1(int n)
   {
       System.out.println(n);
       println2(3);
   }
   static void println2(int n)
   {
       System.out.println(n);
   }
}
