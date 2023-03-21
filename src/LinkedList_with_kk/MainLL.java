
package LinkedList_with_kk;

public class MainLL {

    public static void main(String[] args) {
        
        //for singly linkedlist
      LinkedListt_First list = new LinkedListt_First();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(6);
        list.display();
        list.insertMiddle(33, 4);
        list.display();
        System.out.println( list. deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
         list.insertRec(432, 1);
    list.display();
//        System.out.println(list.deleteParticular(1));
//        list.display();
//        System.out.println(list.deleteParticular(2));
//        list.display();
//        System.out.println(list.deleteParticular(2));
//        list.display();
//        System.out.println(list.deleteParticular(0));
//        list.display();
   
    
    //for dll
   /*  DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(43);
      
        list.display();
      list.  insertLast(44);
      list.display();
      
      list.insertAfter(4,54);
      list.insertAfter(54, 5443);
      list.insertAfter(44, 786);
      list.display();*/
   
    /*   CircularLL ccl=new CircularLL();
       ccl.insertFirst(23);
       ccl.insertFirst(64);
       ccl.insertFirst(54);
       ccl.display();*/
    }

}
