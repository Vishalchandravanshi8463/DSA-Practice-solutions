
package LinkedList_with_kk;


import java.util.*;

public class Stack {
Scanner sc=new Scanner(System.in);
    // QUESTION PUSH AND POP OPERATION IN STACK     IN C++ VISHAL
    int top;
    int arr[] = new int[5];

    Stack() {
        top = -1;
        for (int i = 0; i < 5; i++) {
            arr[i] = 0;
        }
    }

    boolean isempty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isfull() {
        if (top == 4) {
            return true;
        } else {
            return false;
        }
    }

    void push(int val) {
        if (isfull()) {
            System.out.println("stack is overflow");
        } else {
            top++;
            arr[top] = val;
        }
    }

    int pop() {
        if (isempty()) {
            System.out.println("stack underflow");
            return 0;
        } else {
            int popvalue = arr[top];
            arr[top] = 0;
            top--;
            return popvalue;
        }
    }

    int count() {
        return (top + 1);
    }

    int peek(int pos) {
        if (isempty()) {
            System.out.println("stack is undreflow");
            return 0;
        } else {
            return arr[pos];
        }
    }

    void change(int pos, int value) {
        arr[pos] = value;
        System.out.println("value change at location");
    }

    void display() {
        System.out.println("all value in  the stack are");
        for (int i = 4; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }


public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    Stack s1=new Stack();
    int option,position,value;
    do
    {
        System.out.println("what operation do you want to perform select option number ,enter 0 to exit");
        System.out.println("1.push");
        System.out.println("2.push");
        System.out.println("3.isempty");
        System.out.println("3.isfull");
        System.out.println("4.peek");
        System.out.println("6.count");
        System.out.println("7.change");
        System.out.println("8.display");
        option =sc.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("enter as items to push in the stack");
            value=sc.nextInt();
            s1.push(value);
            break;
            case 2:
                System.out.println("pop function called -poped value"+s1.pop());
            break;
            case 3:
            if(s1.isempty())
                    System.out.println("stack is empty");
            else
                    System.out.println("stack is not empty");
            break;
            case 4:
            if(s1.isfull())
                    System.out.println("stack is full");
            else
                    System.out.println("stack is not full");
            break;
            case 5:
                System.out.println("enter the position you want to peek");
            position =sc.nextInt();
                System.out.println("peek function called value at position"+position+" is "+ s1.peek(position));
            break;
            case 6:
                System.out.println("count function called number of itens in the stack are"+s1.count());
            break;
            case 7:
                System.out.println("change function called ");
                System.out.println("enter the position of items you want to change");
            position=sc.nextInt();
            
                System.out.println("enter value the items  you want to change ");
            value=sc.nextInt();
            s1.change(position ,value);
            break;
            case 8:
                System.out.println("enter value the items ");
            s1.display();


        }
    } while (option !=0);

    
 
}
    
}
