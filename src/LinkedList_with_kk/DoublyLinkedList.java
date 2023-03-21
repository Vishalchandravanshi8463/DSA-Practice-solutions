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
public class DoublyLinkedList {
    
    int size;
  private  Node head;
  private  Node tail;
    public DoublyLinkedList()
    {
        this.size=0;
    }
    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
             head.prev=node;
        }
       
        head=node;
        size++;
    }
    public void insertLast(int val) //without tail node
    {
        Node node=new Node(val);
        Node last=head;
        node.next=null;
        if(head==null)
        {
            node.prev=null;
            head=node;
            return;
        }
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        node.next=null;
        
    }
    public Node find(int value)
    {
        Node node=head;
        while(node!=null)
        {
            if(node.val==value)
            {
                return node;
            }
            node =node.next;
        }
        return null;
    }
    public void insertAfter(int after,int val)
    {
        Node p=find(after);
        if(p==null)
        {
            System.out.println("node does not exit ");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null)
        node.next.prev=node;
        
    }
   /* public void insertLast(int val)
    {
        if(tail!=null)
        {
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        node.prev=tail;
        tail.next=node;
        if(tail!=null)
        node.next=null;
        //size++;
    }*/
    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null)
        {
            last=temp;
            System.out.print(temp.val+"-> ");
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println("print in rev");
        System.out.print("first->");
       while(last!=null)
        {
            System.out.print(last.val+"->");
            last=last.prev;
            
        }
        System.out.println("");
    }
    
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val)
        {
            this.val=val;
        }
        Node(int val,Node next,Node prev)
        {
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}
