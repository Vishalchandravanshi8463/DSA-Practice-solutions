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
public class CoustomQueue_kk {

    private int data[];
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CoustomQueue_kk() {
        this(DEFAULT_SIZE);
    }

    public CoustomQueue_kk(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;

    }

    private boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty ");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;

    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty ");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("end");
    }
    
    public static void main(String[] args)throws Exception  {
         CoustomQueue_kk queue=new  CoustomQueue_kk();
         queue.insert(5443);
         queue.insert(3);
         queue.insert(5);
         queue.insert(34);
         queue.insert(4);
         queue.display();
         System.out.println(queue.remove());
         queue.display();
         System.out.println(queue.front());
    }
}
