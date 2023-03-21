/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_with_kushwaha.Comparing_Generics;

/**
 *
 * @author vishal chandravanshi
 */
public class Studentt implements Comparable<Studentt> {
    int roll;
    float marks;
    public Studentt(int roll,float marks)
    {
        this.roll=roll;
        this.marks=marks;
    }
    
    
    @Override
    public String toString()
    {
        return marks+"";
    }
    public int compareTo(Studentt o)
    {
        
        int diff=(int)(this.marks-o.marks);
        return diff;
    }
    
}
