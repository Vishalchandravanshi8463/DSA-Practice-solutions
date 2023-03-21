
import static javafx.scene.input.KeyCode.A;


public class ArraySorted_Recursion {
    public static void main(String[] args) {
        int []arr={24,45,55,91,905};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr,int j)
    {
       
        
          if(j==arr.length-1)
          {
              return true;
          }
          return arr[j]<arr[j+1]&& sorted(arr,j+1);
        
    }
   // A a=new A(10,"vishall");
}
