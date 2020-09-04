package extra0409_Vehicle;

import java.util.Scanner;



public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        car c=new car("Ferrari");
        String s1=c.getBrand();
        String s2=c.speedUp();
        String s3=c.slowDown();
        System.out.println("Brand     :"+s1);
        System.out.println("speed up  :"+s2);
        System.out.println("slow down :"+s3);
    }






    }



