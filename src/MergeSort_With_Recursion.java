
import java.util.Arrays;

public class MergeSort_With_Recursion {

    public static void main(String[] args) {
        int arr[] = {8, 11, 14, 12, 15, 16};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;

        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}

//      int arr[]={5,469,99,3,2,1};
//        mergeSort(arr,0,arr.length);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void mergeSort(int []arr,int s,int e)
//    {
//        if(e-s==1)
//        {
//            return ;
//        }
//        int mid=(s+e)/2;
//       mergeSort(arr, s, mid);
//        mergeSort(arr, mid,e);
//         merge(arr,s,mid,e);
//    }
//    private static void merge(int arr[],int s,int mid,int e)
//    {
//        int []mix=new int[e-s];
//        int i=s,j=mid,k=0;
//        while(i<mid&&j<e)
//        {
//            if(arr[i]<arr[j])
//            {
//                mix[k]=arr[i];
//                i++;
//            }
//            else
//            {
//                mix[k]=arr[j];
//                j++;
//            }
//            k++;
//            
//        }
//        while(i<mid)
//        {
//            mix[k]=arr[i];
//            i++;
//            k++;
//        }
//         while(j<e)
//        {
//            mix[k]=arr[j];
//            j++;
//            k++;
//        }
//        System.arraycopy(mix, 0, arr, s, mix.length);
//    }
//    
//}
