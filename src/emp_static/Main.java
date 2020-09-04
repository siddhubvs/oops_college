package emp_static;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n,i;
        System.out.println("enter no of employees");
        n = sc.nextInt();
        emp E[] = new emp[n];
        for ( i = 0; i < E.length; i++) {
            System.out.println("Empno;Name;Basic_pay");
            int empno = sc.nextInt();
            String name = sc.next();
            double basicpay = sc.nextDouble();
            E[i] = new emp(empno, name, basicpay);

        }
        for ( i = 0; i < E.length; i++) {
            E[i].compute_netsalary();
        }


        emp.displaytotalsalary();
        bubbleSort(E);
        display1(E);
        System.out.println("Enter a name to search the employee");
        String nam=sc.next();
        int k=0;
        for( i =0;i<n;i++) {
            if (nam.equals(E[i].Name)) {
                k = 1;
                break;
            }
        }

            if (k == 1) {
                System.out.println("Employee with name " + nam + " is found and his details are");
                System.out.println("  Employee no    Employee name     Employee company   Basic pay    Net Salaray");

                System.out.printf("  %d            %s             %s           %f      %f\n", E[i].empno, E[i].Name, E[i].cn,E[i].Basic_salary,E[i].netsalary);
            }
            else {
                System.out.println("Employee with name " + nam + " is not found");
            }







    }

    static void bubbleSort(emp E[]) {
        emp temp;
        for (int  i = 0; i < E.length; i++) {
            for (int j = 1; j < (E.length - i); j++) {
                if (E[j - 1].empno > E[j].empno) {
                    //swap elements
                    temp = E[j - 1];
                    E[j - 1] = E[j];
                    E[j] = temp;
                }

            }
        }

    }
    public static void display1(emp E[]){
        for (int i = 0; i < E.length; i++) {
            System.out.printf("\n%10s%10.2f\n", E[i].Name, E[i].netsalary);
        }

    }
}



