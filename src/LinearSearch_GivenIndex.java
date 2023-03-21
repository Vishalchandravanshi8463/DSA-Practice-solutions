import java.util.*;
public class LinearSearch_GivenIndex {
    
    

//FIND WHETHER NUMBER IS EXISTS IN ARRAY OR NOT .........
//to given index 
    
    public static void linear(int []arr,int key,int start,int last){
        int v=0,p=0;
        for(int i=start;i<last;i++ )
        {
            if(arr[i]==key)
            { 
                p=i;
                v++;
                break;
            }
        }
        if(v>=1)
        System.out.println("key is found in the array "+key+" "+" at index "+p);
        else
            System.out.println("not found in the given index");
///for each loop
       /*for(int element :arr){
           if(element==key)
           {
               v++;
           }*/
       }
        /*if(v>=1)
        {
            System.out.println("value is present in the array "+key +" on the index " );
        }
        else
        System.out.println("not found ");*/
    
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
        System.out.println("enter the starting index and last index ");
        int start,last;
        start=s.nextInt();
        last=s.nextInt();
        linear(arr,key,start,last);
    }
}


