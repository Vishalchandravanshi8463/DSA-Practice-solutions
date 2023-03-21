/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// AMAZON MICROSOFT 
package LinkedList_with_kk;

/**
 *
 * @author vishal chandravanshi
 */
public class CycleQuestion {
    
     //LEET CODE CYCLE LINKEDLIST  
    
    public boolean hasCycle(ListNode head) {
        ListNode fast =head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                return true;
            }
            
        }
        return false;
    }
    
    public int LengthCycle(ListNode head) {
        ListNode fast =head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow)
            {
                int length=0;
            ListNode temp=slow;
            do{
                temp=temp.next;
                length++;
            }while(temp!=null);
                return length ;
            }
            
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head) {
        int length =0;
        
         ListNode fast =head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                length=LengthCycle(slow);
                break;
            }
            
        }
        if(length==0)
        {
            return null;
        }
        // FIND THE START NODE 
        ListNode first=head;
        ListNode second=head;
        while(length>0)
        {
            second=second.next;
            length--;
            
        }
        while(first!=second)
        {
            first=first.next;
            second =second.next;
            
        }
        return second;
    }
    
    // leet code happy number  
     public boolean isHappy(int n) {
      int s=n;
        int f=n;
        do{
            s=square(s);
            f=square(square(f));
            
        }while(s!=f);
        if(s==1)
        {
            return true;
        }
        return false;
    }
    public int square(int n)
    {
        int ans=0;
        while(n>0)
        {
           int rem=n%10;
            ans+=rem*rem;
            n=n/10;
        }
        return ans;
    }
    
    //MIDDLE OF THE LINKEDLIST
    public ListNode middleNode(ListNode head)
    {
        ListNode s=head;
        ListNode f=head;
        while(f!=null&&f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
