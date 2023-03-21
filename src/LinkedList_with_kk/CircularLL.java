/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList_with_kk;

/**
 *
 * @author vishal chandravanshi
 */
public class CircularLL {
    
    private Node head;
    private Node tail;
    public CircularLL()
    {
        this.head=null;
        this.tail=null;
    }
    public void insertFirst(int val)
    {
        Node node =new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
            return;
        }
       
        tail.next=node;
         node .next=head;
         tail=node;
    }
    public void display(){
        Node node=head;
        if(head!=null)
        {
            do{
                System.out.print(node.val+"->");
                node=node.next;
            }while(node!=head);
            System.out.println("END");
        }
    }
    
    public class Node{
        int val;
        Node next;
        public Node(int val)
        {
            this.val=val;
        }
    }
}
