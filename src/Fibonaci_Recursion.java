

//fibonacci series with vishal chandravanshi
public class Fibonaci_Recursion {
    public static void main(String[] args) {
        int ans=fib(7);
        System.out.println(ans);
    }
    static int fib(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
