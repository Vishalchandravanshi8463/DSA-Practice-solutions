/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList_with_kk;

/**
 *
 * @author vishal chandravanshi
 */
import java.util.*;

public class ARRAYInsert {

    public static int[] addX(int n, int arr[], int x) {
        int i;

        int newarr[] = new int[n + 1];

        for (i = 0; i < n; i++) {
            newarr[i] = arr[i];
        }

        newarr[n] = x;

        return newarr;
    }

    public static void main(String[] args) {

        int n = 10;
        int i;
Scanner sc=new Scanner (System.in);
        System.out.println("enter the size ");
n=sc.nextInt();
        int arr[]=new int[n];// {11, 2, 3, 4, 5, 6, 6, 8, 11, 10};

        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }
        System.out.println("Initial Array:" + Arrays.toString(arr));

        
        int x = 50;

       
        arr = addX(n, arr, x);

       
        System.out.println("Array with " + x+ " added:"+ Arrays.toString(arr));
    }
}
