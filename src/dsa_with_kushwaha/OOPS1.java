package dsa_with_kushwaha;

import java.util.Arrays;

public class OOPS1 {

    public static void main(String[] args) {

        //     Student[] students=new Student[5];
        //      System.out.println(Arrays.toString(students));
        /* System.out.println(vishal.name="vishal");
        System.out.println(vishal.rollno=94);

        System.out.println(vishal.marks=34);*/
        Student vishal = new Student(88f, "Sangita bai ", 19);
    //    vishal.changeName("Thakur Prasad Chandravanshi");
    //    vishal.greeting();
        System.out.println(vishal.name);
        System.out.println(vishal.marks);

        System.out.println(vishal.rollno);

        Student Thakur=new Student();
         System.out.println(Thakur.name);
        System.out.println(Thakur.marks);

        System.out.println(Thakur.rollno);
        Student Shubham=new Student(vishal);
        System.out.println(Shubham.name);
        
        Student Rahul=new Student();
        System.out.println(Rahul.rollno);
       
        System.out.println(Rahul.name);
        System.out.println(Rahul.marks);
        
        Student one=new Student ();
        Student two=one;
        one.name="something something";
        System.out.println(two.name);
    }

}

class Student {

    int rollno;
    String name;
    float marks ;

    void greeting() {
        System.out.println("my name is " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }

    Student(float marks, String name, int rollno) {
        this.marks = marks;
        this.name = name;
       this. rollno = rollno;
    }
    //Constructor overloading 
    Student()
    {
        this(54f,"rahul",67);
    }
   /* Student()
    {
       this.   marks = 23f;
        this.name = "Vishal thakur prasad chandravanshi ";
       this. rollno = 5403;
    }*/
    Student (Student other)
    {
        this.marks=other.marks;
        this.name=other .name;
        this.rollno=other.rollno;
    }

}
