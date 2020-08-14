package Rectangle_constructor;



import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        rectangle_constructor rect1=new rectangle_constructor(25,45);
        rectangle_constructor rect2=new rectangle_constructor(14,28);

        System.out.println("enter rect1 length");
        int len1=sc.nextInt();
        rect1.setLength(len1);
        System.out.println("enter rect1 breadth");
        int bre1=sc.nextInt();
        rect1.setBreadth(bre1);


        System.out.println("enter rect2 length");
        int len2=sc.nextInt();
        rect2.setLength(len2);
        System.out.println("enter rect2 breadth");
        int bre2=sc.nextInt();
        rect2.setBreadth(bre2);

        System.out.println("Area of rectangle 1 is " +rect1.computearea(len1,bre1));
        System.out.println("Perimeter of rectangle 1 is " +rect1.computeperimeter(len1,bre1));
        System.out.println("Area of rectangle 2 is " +rect2.computearea(len2,bre2));
        System.out.println("Perimeter of rectangle 2 is " +rect2.computeperimeter(len2,bre2));




    }







    }



