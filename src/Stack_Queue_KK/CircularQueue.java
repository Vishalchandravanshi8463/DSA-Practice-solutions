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
public class CircularQueue {

    protected int data[];
    private static final int DEFAULT_SIZE = 5;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;

    }

    private boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end] = item;
        end++;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty ");
        }
        int removed = data[front++];

        front = front % data.length;
        size--;

        return removed;

    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty ");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("empty CQ");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + "-> ");
            i++;
            i %= data.length;

        } while (i != end);

        System.out.println("end");
    }

    public static void main(String[] args) throws Exception {

        CircularQueue queue = new CircularQueue();

        queue.insert(5443);
        queue.insert(3);
        queue.insert(5);
        queue.insert(34);
        queue.insert(4);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        System.out.println(queue.front());
        queue.insert(4223);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(12);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(121);
        queue.display();
    }

}
