import java.util .*;
// greatest number less than equal to <=target
public class Floor {
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
        if(ans>0)
        System.out.println(arr[ans]);
        else 
              System.out.println("target is too much greater than arr element ");
    }

    public static int ceiling(int arr[], int target) {
        if(target>arr[arr.length-1])
        {
            return -1;
        }
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
        return end;
    }
}




