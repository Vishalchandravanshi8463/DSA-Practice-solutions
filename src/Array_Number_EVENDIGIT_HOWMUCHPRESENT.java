import java.util.*;

//LeetCode


public class Array_Number_EVENDIGIT_HOWMUCHPRESENT {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("enter the size of array ");
        int size=s.nextInt();
        System.out.println("enter the array element ");
        int []arr=new int [size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("digits are present "+digits2(345678));
       // System.out.println(findNumbers(arr));
    }
    static int digits2(int num)
    {
        return (int )(Math.log10(num)+1);
    }
    
    static int findNumbers(int arr[])
    {
        int count =0;
        for(int num:arr)
        {
            if(even(num)){
                count++;
                
            }
        }
        return count;
    }
   static boolean even(int num)
    {
        int numberofDigits=digits(num);
        if(numberofDigits%2==0)
        {
            return true;
        }return false;
    }
    public static int digits(int num)
    {
        int count =0;
        while(num>0)
        {
            if(num<0){
                num=num*-1;
                
            }
            if(num==0){
                return 1;
            }
            count++;
            num=num/10;
        }
        return count;
    }
    
}
