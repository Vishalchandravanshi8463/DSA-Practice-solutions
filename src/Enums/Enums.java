/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author vishal chandravanshi
 */
public class Enums {
    
    enum Week{
    Monday ,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
     Week(){
        System.out.println("constructor is calling "+this);
    }
}
   
    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
        for(Week day:Week.values()){
            System.out.println(day);
        }
        System.out.println(week);
        
        //position
        System.out.println(week.ordinal());
    }
}
