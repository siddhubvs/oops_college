package net_salary;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {




        System.out.println("Empno;Name;Basic_pay");
        int empno=sc.nextInt();
        String name=sc.next();
        double basicpay=sc.nextDouble();
        Employee E1=new Employee(empno,name,basicpay);





        E1.compute_netsalary();
        E1.display();



    }
}


