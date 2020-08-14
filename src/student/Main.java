package student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Student student1=new Student();
       Student student2=new Student();

       student1.setdata(123,"raju","hyderabad");
       student2.setdata(124,"asif","secunderabad");

       student1.display();
       student2.display();


    }
}



