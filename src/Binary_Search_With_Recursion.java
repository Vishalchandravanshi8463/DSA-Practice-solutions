
public class Binary_Search_With_Recursion {
    public static void main(String[] args) {
        int arr[]={1,3,5,8,32,75};
        int target=81;
        int s=0;
        int e=arr.length-1;
        System.out.println(search(arr,target ,s,e));
    }
    static int search(int arr[],int target ,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int m=s+(e-s)/2;
        if(target==arr[m])
                {
                    return m;
                }
        if(target>arr[m])
        {
            return search(arr,target,s=m+1,e);
        }
        return search(arr,target,s,e=m-1);
    }
}
