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
public class Dynamic_Queue extends CircularQueue {
    public Dynamic_Queue()
    {
        super();
    }
     public Dynamic_Queue(int size)
    {
        super(size);
    }
    @Override
    public boolean insert(int item)
    {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i)%data.length];
            }
            front =0;
            end=data.length;
            
            data = temp;
        }
        
        
        return super.equals(insert(item));
    }
    public static void main(String[] args) throws Exception {
         Dynamic_Queue queue =new Dynamic_Queue();
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
