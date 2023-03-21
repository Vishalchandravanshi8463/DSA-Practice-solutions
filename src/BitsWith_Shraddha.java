
import java.io.PrintStream;
import java.util.Scanner;
import java.lang.*;
public class BitsWith_Shraddha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 
        know the bit 
        int n=5;
       int pos=2;
       int bitmask=1<<pos;
       if((bitmask&n)==0)
       {
           System.out.println("bit is 0");
       }
       else
       {
           System.out.println("bit is 1");
       }*/

 /*
     //or operation with no 
     set operation  
     int n=5;
     int pos=1;
     int bitmask=1<<pos;
     int newno=bitmask|n;
        System.out.println("new no is  "+newno);
         */
 /*   //clear the position bit means 0 the position bit 
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int notmask=~(bitmask);
        System.out.println((notmask&n));*/
        //update the bit which you want 
        //Scanner sc=new Scanner(System.in);
        /*int n=5;
     int pos=1;
     int bitmask=1<<pos;
        System.out.println("enter the bit conerter which you want ");
        int bit=sc.nextInt();
        if(bit==0)
        {
            int newbit=~(bitmask);
            System.out.println((newbit&n));
        }
        else
        {
            System.out.println((bitmask|n));
        }
         */
        int m = sc.nextInt();
        String s = sc.next();
        double x = Integer.parseInt(s, 2);

        System.out.println(x);
        double arr[]=new double[m];
        int a=2;
       // b=0;
        for(int i=0,b=0;i<m;i++,b++)
        {
            double xx=x/((Math. pow(a, b)));
            arr[i]=xx;
        }
        for(int i=0;i<m;i++)
        {
         //   PrintStream /*print*/;
            
           //double l =  Integer.toBinaryString(arr[i]);
            
           // print = System.out.print((l&x));
        }

    }
}
