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
import java .util.*;
public class Queue1_kk {
    public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<Integer>();
//        q.add(4);
//        q.add(65);
//        q.add(643);
//        q.add(232);
//        System.out.println(q);
//        System.out.println(q.remove());
//        System.out.println(q);
//        System.out.println(q.peek());
//        
        Deque <Integer> dq=new ArrayDeque<Integer>();
        dq.add(32);
        dq.addLast(35);
        dq.addFirst(42);
        System.out.println(dq);
        System.out.println(dq.remove());
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq);
    }
}
