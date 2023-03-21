
public class PeakElement_MountainArray {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,7,9,4,2};
      int ans=  peak(arr);
        System.out.println(ans);
    }
    static int peak(int arr[])
    {
        //1 3 4 6 5 2 
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
                
            }
        }
        return start;
    }
}
