
public class RotatedBinarySearch_Recursion {
    public static void main(String[] args) {
        int []arr={3,5,6,1,2};
        int target =3;
        int s=0;int e=arr.length-1;
        System.out.println(search(arr,target,s,e));
    }
    static int search(int[] arr,int target,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target)
        {
            return m;
        }
        if(arr[s]<=arr[m])
        {
            if(arr[s]<=target&&target<=arr[m])
            {
                return search(arr,target,s,e=m-1);
            }
            else
            {
                 return search(arr,target,s=m+1,e);
            }
        }
        if(target>=arr[m]&&target<=arr[e])
        {
             return search(arr,target,s=m+1,e);
        }
         return search(arr,target,s,e=m-1);
    }
}
