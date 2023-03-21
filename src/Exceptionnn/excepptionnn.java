/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptionnn;

/**
 *
 * @author vishal chandravanshi
 */
public class excepptionnn {
    public static void main(String[] args) {
        int a=4;
        int b=5;
       
        try{
             divide(a,b);
        String name="vishggfal";
        if(name.equals("vishal"))
        {
            throw new MyException("name is vishal");
        }
        }
        catch(MyException | ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("are you good ");
        }
    }
        static int divide(int a,int b) throws ArithmeticException
        {
            if(b==0)
            {
                throw new ArithmeticException("please do not divide the zeroo");
            }
           
            return a/b;
        }
    
}
