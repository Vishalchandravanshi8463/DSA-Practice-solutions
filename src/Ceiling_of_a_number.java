
import java.util.*;

//smallest number greater than equal to target >=target
public class Ceiling_of_a_number {

    public static void main(String[] args) {

        //int arr[]={23,43,45,88,100,121};
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of array ");
        for (int i = 0; i < size; i++) {

            arr[i] = s.nextInt();
        }

        System.out.println("enter the target ");
        int target = s.nextInt();
        int ans = (ceiling(arr, target));
        System.out.println(arr[ans]);
    }

    public static int ceiling(int arr[], int target) {
        int start = 0;
        int end = (arr.length) - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}


