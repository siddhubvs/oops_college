package student;

public class Student {
    int rollno;
    String name;
    String address;

    void setdata(int rollno,String name,String address) {
        this.rollno = rollno;
        this.address = address;
        this.name = name;
    }
        void display(){
            System.out.println("student name is " + name);
            System.out.println("student roll no is "+rollno);
            System.out.println("student address is "+address);

        }
    }

