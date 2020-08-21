package cone_inherit;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        circle c1=new circle();
        System.out.println("enter radius");
        int r=sc.nextInt();
        c1.setRadius(r);
        double area=c1.computearea();
        System.out.printf("%.3f\n",area);

        cone co1=new cone();
        co1.setRadius(r);
        System.out.println("enter height");
        int h=sc.nextInt();
        co1.setHeight(h);
        double volume= co1.volume();
        System.out.printf("%.3f",volume);




    }
}


