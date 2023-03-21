
import java.util.*;

public class LinearSearch_in_String {

    public static boolean search(String str, char target) {
        
        if (str.length() == 0) {
            return false;
        }
        /*for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }*/
        //for each loop
        for(char ch:str.toCharArray()){
            if(ch==target )
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the name or anything which you want ");
        String name = s.next();
        
      //  System.out.println("enter the target which you want to find ");
       // char target = s.next().charAt(0);
        //System.out.println(search(name, target));
        
        System.out.println(name.toCharArray());

    }
}
