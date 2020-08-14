package parrot;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter name,age and color of first parrot");
        String name=sc.next();
        int age=sc.nextInt();
        String color=sc.next();

     parrot p1=new parrot(name,color,age);
     parrot p2=new parrot(p1);
     parrot p3=new parrot(p1);
        System.out.println("enter name of second parrot");
        String name2=sc.next();
        System.out.println("enter name of third parrot");
     p2.setName(name2);
        String name3=sc.next();
     p3.setName(name3);
     p1.display();
     p2.display();
     p3.display();

    }
}


