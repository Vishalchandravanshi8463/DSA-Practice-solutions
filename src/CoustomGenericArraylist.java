/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 * @param <T>
 */

import java.util.*;
public class CoustomGenericArraylist<T> {
   private Object[] data;
   private final static int DefaultSize=10;
    private int size=0;
    public CoustomGenericArraylist()
   {
    data=new Object[DefaultSize];
    }
   public void add(T num)
   {
       if(isFull())
       resize();
       data[size++]=num;
   }
    
    private boolean isFull()
    {
        return size==data.length;
    }
    private void resize(){
         Object[] temp=new Object[data.length*2];
       for(int i=0;i<data.length;i++)
       {
           temp[i]=data[i];
       }
        
        data=temp;
    }
    public T removed()
    {
        T removedd=(T)data[--size];
        return removedd;
    }
    public T get(int index)
    {
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int ind,T value)
    {
        data[ind]=value;
    }
   @Override
    public String toString(){
        return "CoustomArraylist{ data ="+Arrays.toString(data)+" ,size="+size+"}";
    }
   public static void main(String[] args) {
        CoustomGenericArraylist<Integer> list2=new CoustomGenericArraylist<>();
        for(int i=0;i<14;i++)
            list2.add(2*i);
        System.out.println(list2);
        CoustomGenericArraylist<String> list3=new CoustomGenericArraylist<>();
        for(int i=0;i<14;i++)
            list3.add("a");
        System.out.println(list3);
    }
}




//normal create Arraylist
/*
import java.util.*;
public class CoustomGenericArraylist{
   private int data[];
   private final static int DefaultSize=10;
    private int size=0;
    public CoustomGenericArraylist()
    {
        this.data=new int[DefaultSize];
    }
   public void add(int num)
   {
       if(isFull())
       resize();
       data[size++]=num;
   }
    
    private boolean isFull()
    {
        return size==data.length;
    }
    private void resize(){
        int temp[]=new int[data.length*2];
       for(int i=0;i<data.length;i++)
       {
           temp[i]=data[i];
       }
        
        data=temp;
    }
    public int removed()
    {
        int removedd=data[--size];
        return removedd;
    }
    public int get(int index)
    {
        return data[index];
    }
    public int size(){
        return size;
    }
    public int set(int ind,int value)
    {
       return  data[ind]=value;
    }
   @Override
    public String toString(){
        return "CoustomArraylist{ data ="+Arrays.toString(data)+" ,size="+size+"}";
    }
    public static void main(String[] args) {
        CoustomGenericArraylist list=new CoustomGenericArraylist();
        list.add(67);
        list.add(3243);
        System.out.println(list);
        list.removed();
    }
}*/
