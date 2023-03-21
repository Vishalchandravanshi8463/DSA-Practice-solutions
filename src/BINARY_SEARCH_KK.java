import java .util.*;
public class BINARY_SEARCH_KK {
    public static void main(String[] args) {
        
       //  QUESTION  BINARY SEARCH   BY VISHAL CHANDRAVANSHI 
        //int arr[]={23,43,45,88,100,121};
        Scanner   s=new Scanner (System.in);
        System.out.println("enter the size of array");
        int size=s.nextInt();
        int []arr=new int[size];
        System.out.println("enter the elements of array ");
        for(int i=0;i<size;i++)
            
        {
            
            arr[i]=s.nextInt();
        }
      
        System.out.println("enter the target ");
        int target =s.nextInt();
        int ans=(Binary(arr,target));
        System.out.println(ans);
    }
    
    public static int Binary(int arr[],int target)
    {
        int start=0;
        int end=(arr.length)-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
                
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
