package circle_interface;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter radius of circle");
        double r=sc.nextDouble();
    circle c=new circle(r);
    c.ComputeArea();
    c.ComputePer();




    }
}


