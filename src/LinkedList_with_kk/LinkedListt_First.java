package LinkedList_with_kk;

public class LinkedListt_First {

     //SINGLY LINKED LIST BY VISHAL CHANDRAVANSHI 
    private class Node {

        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedListt_First() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        if (head == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insertMiddle(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;

        }
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;

    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index--, node.next);
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();

        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        // size--;
        return val;
    }

    public int deleteParticular(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node pre = get(index - 1);
        int val = pre.next.value;
        pre.next = pre.next.next;

        return val;
    }

    public static LinkedListt_First merge(LinkedListt_First first, LinkedListt_First second) {
        Node f = first.head;
        Node s = second.head;
        LinkedListt_First ans = new LinkedListt_First();
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void duplicate() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;

            } else {
                node = node.next;

            }
        }
        tail = node;
        node.next = null;
    }

//    public void bubbleSort() {
//        bubbleSort(size - 1, 0);
//    }
    

    
    //REVERSE LINKEDLIST THROUGH RECURSION

    private void reverse(Node node) {
        if (node == tail) {
            head =tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
//    ListNode getMid(ListNode head)
//    {
//        ListNode midpre=null;
//        while(head!=null&&head.next!=null)
//        {
//            midpre=(midpre==null)?head:midpre.next;
//            head=head.next.next;
//            
//        }
//        ListNode mid=midpre.next;
//        midpre.next=null;
//        return mid;
//    }

    public static void main(String[] args) {
        LinkedListt_First first=new LinkedListt_First();
         LinkedListt_First second=new LinkedListt_First();
        first.insertLast(1);
         first.insertLast(3);
          first.insertLast(3);
           second.insertLast(1);
            second.insertLast(4);
             second.insertLast(5);
             LinkedListt_First ans=LinkedListt_First.merge(first, second);
             ans.display();
        
//        LinkedListt_First listt = new LinkedListt_First();
//        for (int i = 7; i > 0; i--) {
//            listt.insertLast(i);
//        }
//        listt.display();
//        listt.bubbleSort();
//        listt.display();
//        listt.reverse(listt.tail);
//        listt.display();
//        LinkedListt_First list=new LinkedListt_First();
//        list.insertLast(1);
//         list.insertLast(1);
//          list.insertLast(2);
//           list.insertLast(3);
//            list.insertLast(3);
//            list.display();
//            list.duplicate();
//            list.display();
// LinkedListt_First first=new LinkedListt_First();
first.display();
             first.reverse(first.head);
             first.display();
             
    }

}
