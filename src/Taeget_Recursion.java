
import java.util.ArrayList;
import static java.util.Collections.list;


public class Taeget_Recursion {
    
    public static void main(String[] args) {
        int arr[]={3,42,54,344,6457,65,432,344,344};
        int target=344;
        System.out.println(target(arr,target,0));
        System.out.println(index(arr,target,0));
         System.out.println(indexlast(arr,target,arr.length-1));
         /*  indexAll(arr,target,0);
          System.out.println(list);*/
          ArrayList<Integer> ans=indexAll(arr,target,0,new ArrayList<>());
          
         
        System.out.println( ans);
        System.out.println("______________");
           System.out.println(indexlist1(arr,target,0));
         
    }
    static boolean target(int []arr,int target,int j)
    {
        if(j==arr.length)
        {
            return false;
        }
        return target==arr[j]||target(arr,target,j+1);
    }
    
     static int index(int []arr,int target,int j)
    {
        if(j==arr.length)
        {
            return -1;
        }
        if(arr[j]==target)
        {
            return j;
        }
        else
        return index(arr,target,j+1);
    }
       static int indexlast(int []arr,int target,int j)
    {
        if(j==-1)
        {
            return -1;
        }
        if(arr[j]==target)
        {
            return j;
        }
        else
        return indexlast(arr,target,j-1);
    }
     /*  static ArrayList<Integer> list=new ArrayList<>();
     static void indexAll(int []arr,int target,int j)
    {
        if(j==arr.length)
        {
            return ;
        }
        if(arr[j]==target)
        {
            list.add(j);
        }
        
         indexAll(arr,target,j+1);
    }*/
     
      static ArrayList<Integer>indexAll(int []arr,int target,int j,ArrayList<Integer> list)
    {
        if(j==arr.length)
        {
            return list;
        }
        if(arr[j]==target)
        {
            list.add(j);
        }
        
       return indexAll(arr,target,j+1,list);
    }
       static ArrayList<Integer>indexlist1(int []arr,int target,int j)
    {
        ArrayList<Integer>list=new ArrayList<>();
        if(j==arr.length)
        {
            return list;
        }
        if(arr[j]==target)
        {
            list.add(j);
        }
        ArrayList<Integer> ListBelow=indexlist1( arr, target, j+1);
        list.addAll(ListBelow);
       return list;
    }
}
