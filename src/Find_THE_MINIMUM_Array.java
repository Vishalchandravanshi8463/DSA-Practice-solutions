
import java.util.*;

public class Find_THE_MINIMUM_Array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("enter the array element ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
       /* int min = 21323434;
        for (int i = 0; i < size - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }*/
       //ANOTHER WAY;;
       int ans=arr[0];
       for(int i=0;i<size;i++)
       {
           if(ans>arr[i])
           {
               ans=arr[i];
           }
       }
        System.out.println("smallest element is " + ans);
    }
}
