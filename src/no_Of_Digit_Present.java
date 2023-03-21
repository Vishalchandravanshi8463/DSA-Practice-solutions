

public class no_Of_Digit_Present {
    
    public static void main(String[] args) {
        int n=324356542;
        int b=10;
        int ans=(int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
    
}
