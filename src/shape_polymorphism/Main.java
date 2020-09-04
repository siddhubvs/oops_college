package shape_polymorphism;

import java.util.Scanner;


public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter sides of triangle");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        shape s=new triangle(s1,s2,s3);
        s.computeArea();
        System.out.println("enter length and breadth of rectangle");
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        s=new rectangle(r1,r2);
        s.computeArea();
    }
    }










