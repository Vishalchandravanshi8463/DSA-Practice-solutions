/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Queue_KK;

/**
 *
 * @author vishal chandravanshi
 */
import java.util.*;

public class Stack1_kk {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(43);

        stack.push(432);
        stack.push(112);
        stack.push(75);
        stack.push(742);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
