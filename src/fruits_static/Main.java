package fruits_static;


import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter no and name of fruit");
        int n=sc.nextInt();
        String f=sc.next();
        fruits fruit1=new fruits(n,f);
        System.out.println("enter no and name of fruit");
        int n1=sc.nextInt();
        String f1= sc.next();
        fruits fruit2=new fruits(n1,f1);
        fruit1.display();
        fruit2.display();


        System.out.println(fruits.n);










    }
}


