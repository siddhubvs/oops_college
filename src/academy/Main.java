package academy;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        System.out.println("enter age");
        int age=sc.nextInt();
        horse1.setAge(age);
        System.out.println("enter color");
        String color=sc.next();
        horse1.setColor(color);
        System.out.println("enter weight");
        double weight=sc.nextDouble();
        horse1.setWeight(weight);




        System.out.println("Age is "+ horse1.getAge());
        System.out.println("Weight is "+horse1.getWeight());
        System.out.println("color is "+horse1.getColor());


    }
}


