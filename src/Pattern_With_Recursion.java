import java.util.*;
public class Pattern_With_Recursion {
    public static void main(String[] args) {
        int r=4,c=0;
        triangle(r,c);
        triangle1(r,c);
        int []arr={4,5,333,3,64,4};
       bubble(arr,arr.length-1,0);
        System.out.println("_________________");
        System.out.println(Arrays.toString(arr));
    }
    static void triangle(int r,int c)
    {
        if(r==0)
        {
            return ;
        }
        if(c<r)
        {
            System.out.print("* ");
            triangle(r,c+1);
        }
        else
        {
            System.out.println("");
            triangle(r-1,c=0);
        }
    }
    
    static void triangle1(int r,int c)
    {
        if(r==0)
        {
            return ;
        }
        if(c<r)
        {
             triangle1(r,c+1);
            System.out.print("* ");
           
        }
        else
        {
            triangle1(r-1,c=0);
            System.out.println("");
            
        }
    }
    static void bubble(int[] arr,int r,int c)
    {
        
         if(r==0)
        {
            return  ;
        }
         if(c<r){
        if(arr[c]>arr[c+1])
        {
            int temp=arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
           
            
        }
         
         bubble(arr,r,c+1);
         }
        else
        {
            bubble(arr,r-1,c=0);
            
        }
        
    }
}
