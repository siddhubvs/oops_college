package grade_ifelse;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter score");
        int marks=sc.nextInt();
        if(marks == 100){
            System.out.println("Grade S");
        }else if(marks >= 90 && marks <100){
            System.out.println("Grade A+");
        }else if(marks >= 80 && marks < 90){
            System.out.println("Grade A");
        }else if(marks >= 70 && marks < 80){
            System.out.println("Grade B+");
        }else if(marks >= 60 && marks < 70){
            System.out.println("Grade B");
        }else if(marks >= 50 && marks < 60) {
            System.out.println("Grade C+");
        } else if(marks >= 40 && marks <50){
                System.out.println("Grade C");
        }else {
            System.out.println("Fail");
        }
        }


    }



