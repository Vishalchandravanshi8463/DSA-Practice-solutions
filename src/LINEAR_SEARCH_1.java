
import java.util.*;

//FIND WHETHER NUMBER IS EXISTS IN ARRAY OR NOT .........
public class LINEAR_SEARCH_1 {
    //  QUESTION LINEAR SEARCH  BY VISHAL CHANDRAVANSHI 
    public static void linear(int []arr,int key,int size){
        int v=0,p=0;
       
       for(int element :arr){
           if(element==key)
           {
               v++;
           }
       }
        if(v>=1)
        {
            System.out.println("value is present in the array "+key +" on the index " );
        }
        else
        System.out.println("not found ");
    }
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner s=new Scanner (System.in);
        int size=s.nextInt();
        
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("enter the value which you want to find in the array ");
        int key=s.nextInt();
        linear(arr,key,size);
    }
}
