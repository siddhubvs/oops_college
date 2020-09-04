package academy;

import Horse_constructor.horse;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        System.out.println("enter age of horse 1");
        int age=sc.nextInt();
        horse1.setAge(age);
        System.out.println("enter color of horse 1");
        String color=sc.next();
        horse1.setColor(color);
        System.out.println("enter weight of horse 1");
        double weight=sc.nextDouble();
        horse1.setWeight(weight);
        Horse horse2=new Horse();
        System.out.println("enter age of horse 2");
        int a=sc.nextInt();
        horse2.setAge(a);
        System.out.println("enter color of horse 2");
        String c=sc.next();
        horse2.setColor(c);
        System.out.println("enter weight of horse 2");
        double w=sc.nextDouble();
        horse2.setWeight(w);
        System.out.println("horse1 details are\n");
        horse1.display();
        System.out.println("horse2 details are\n");
        horse2.display();






    }
}


