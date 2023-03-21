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
public class CoustomStack_KK {

    protected int data[];
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CoustomStack_KK() {
        this(DEFAULT_SIZE);
    }

    public CoustomStack_KK(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException_CoustomStack {
        if (isEmpty()) {
            throw new StackException_CoustomStack("cannot pop from an empty stack !");
        }
//        int removed=data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws StackException_CoustomStack {
        if (isEmpty()) {
            throw new StackException_CoustomStack("cannot peek from an empty stack !");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;

    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args) throws StackException_CoustomStack {

//        CoustomStack_KK cs = new CoustomStack_KK(5);
//dynamic haha 
        CoustomStack_KK cs = new DynamicStack_kk();
        cs.push(54);
        cs.push(23);
        cs.push(7);
        cs.push(4);
        cs.push(21);
        cs.push(66);
        cs.push(74);
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());

    }
}
