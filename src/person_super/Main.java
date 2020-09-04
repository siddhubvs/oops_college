package person_super;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter student rno and name");
        int no=sc.nextInt();
        sc.nextLine();
        String n=sc.nextLine();
        student s=new student(no,n);
        s.display();


    }
}


