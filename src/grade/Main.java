package grade;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter score");
        int marks=sc.nextInt();
        switch(marks/10)
        {
            case 10 :
                System.out.println("Grade S");
                break;
            case 9 :
                System.out.println("Grade A+");

                break;
            case 8 :
                System.out.println("Grade A");
                break;
            case 7 :
                System.out.println("Grade B+");
                break;
            case 6 :
                System.out.println("Grade B");
                break;
            case 5 :
                System.out.println("Grade C+");
            case 4 :
                System.out.println("Grade C");
                break;
            default :
                System.out.println("Fail");

        }


    }
}


