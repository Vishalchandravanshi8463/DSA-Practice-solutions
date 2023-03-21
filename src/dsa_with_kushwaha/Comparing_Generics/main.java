/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_with_kushwaha.Comparing_Generics;

import java.util.Arrays;

/**
 *
 * @author vishal chandravanshi
 */
public class main {
    public static void main(String[] args) {
        Studentt vishal=new Studentt(187,89.4f);
        Studentt shivaa=new Studentt(147,59.4f);
        Studentt shubhu=new Studentt(1837,49.4f);
        Studentt shiyaa=new Studentt(47,39.4f);
        Studentt piyaa=new Studentt(37,44.4f);
        Studentt[] list={vishal,shivaa,shubhu,shiyaa,piyaa};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        if(vishal.compareTo(shivaa)>0)
        {
            System.out.println(vishal.compareTo(shivaa));
            System.out.println("vishal is higher position");
        }
    }
}
