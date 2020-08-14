package Employee_array;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.println("enter no of employees");
        n= sc.nextInt();
        Employee E[]=new Employee[n];
        for(int i=0;i<E.length;i++){
            System.out.println("Empno;Name;Basic_pay");
            int empno=sc.nextInt();
            String name=sc.next();
            double basicpay=sc.nextDouble();
             E[i]=new Employee(empno,name,basicpay);
        }
        for (int i=0;i< E.length;i++){
            E[i].compute_netsalary();
        }
        for(int i=0;i< E.length;i++){
            System.out.printf("%10s%10.2f\n",E[i].Name,E[i].netsalary);
        }


    }
}


