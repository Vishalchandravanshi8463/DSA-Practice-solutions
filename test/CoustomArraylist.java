/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 */
import java.util.*;

public class CoustomArraylist {

    private int data[];
    private static  int DefaultSize=10;
    private int size=0;
    public CoustomArraylist(){
        this.data=new int[DefaultSize];
    }
    public void add(int num)
    {
        if(isFull())
        resize();
                
        data[size++]=num;
        
    }
    private boolean isFull(){
        return size==data.length;
    }
     private void resize() {
         int []temp=new int[data.length*2];
         for(int i=0;i<data.length;i++)
             temp[i]=data[i];
         
         data=temp;
    }
     
     public int remove(){
         --size;
         return data[size];
        // return removedd;
     }
     
     public int get(int index)
     {
         return data[index];
     }
     public int size()
     {
         return size;
     }
     public void set(int index,int value)
     {
         data[index]=value;
     }
    
     public String toString()
     {
         return "CoustomArraylist{"+"data="+Arrays.toString(data)+"size,"+size+'}';
     }
    public static void main(String[] args) {
       
        CoustomArraylist list=new CoustomArraylist();
       // list.add(3);
       // list.add(54);
      //  list.add(5454);
        for(int i=0;i<20;i++)
        {
            list.add(2*i);
        }
        System.out.println(list);
        list.remove();
        list.remove();
        list.remove();
        System.out.println(list);
    }

   
}
