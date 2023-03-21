
public class IsPalindrome_String {
    public static void main(String[] args) {
        String str="abcdcba";
        palindrome(str);
     /*   System.out.println(isPalindrome(str));*/
    }
    /*static boolean isPalindrome(String str)
    {
        if(str.length()==0||str==null)        {

            return true;
        }
        for(int i=0;i<str.length()/2;i++)
        {
           char start=str.charAt(i);
           char end=str.charAt(str.length()-1-i);
            if(start!=end)
                return false;
        }
        return true;
    }*/
    static void palindrome(String str)
    {
        StringBuilder builder=new StringBuilder();
      //String sr= builder.reverse();
      StringBuilder sttr=builder.reverse();
        System.out.println(sttr);
    }
}
