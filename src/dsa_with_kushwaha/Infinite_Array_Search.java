
package dsa_with_kushwaha;

public class Infinite_Array_Search {
    public static void main(String[] args) {
        int []arr={12,32,34,43,435};
        int target=435;
        System.out.println(ans(arr,target));
    }
    
    // only for other purpose this method 
     public static void message(){
           System.out.println("my name is vishal .i complete package");
       }
    
    static int ans (int []arr,int target){
        int s=0;
        int end=1;
        while(target>arr[end])
        {
            int temp=end+1;
            end=end+(end-s+1)*2;
            s=temp;
        }
        return Binary(arr,target,s,end);
    }
    public static int Binary(int arr[],int target,int start,int end)
    {
       
        
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
