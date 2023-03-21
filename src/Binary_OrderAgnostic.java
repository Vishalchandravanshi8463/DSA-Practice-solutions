
import java.util.*;

public class Binary_OrderAgnostic {

    public static void main(String[] args) {
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
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }

    public static int orderAgnostic(int arr[], int target) {
        int start = 0;
        int end = (arr.length) - 1;
        boolean isAC = (arr[0] < arr[end]);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if (isAC) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else if (target > arr[mid]) {
                    start = mid + 1;

                }
            } 
            else {
                
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
