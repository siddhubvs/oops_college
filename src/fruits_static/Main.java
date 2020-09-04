package fruits_static;


import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter name of fruit");

        String f=sc.next();
        fruits fruit1=new fruits(f);
        System.out.println("enter  name of fruit");

        String f1= sc.next();
        fruits fruit2=new fruits(f1);
        fruit1.display();
        fruit2.display();


        System.out.println(fruits.n);










    }
}


