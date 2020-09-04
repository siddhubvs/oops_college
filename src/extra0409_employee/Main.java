package  extra0409_employee;



import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1.Monthly based employee");
        System.out.println("2.contract based employee");
        int o;
        o=sc.nextInt();
        Employee e=null;
        switch(o){
            case 1:System.out.println("Enter name");
                String n=sc.next();
                System.out.println("enter empno");
                String no=sc.next();
                System.out.println("enter basic pay");
                double b=sc.nextDouble();
                System.out.println("enter hra");
                double hra=sc.nextDouble();
                System.out.println("enter da");
                double da=sc.nextDouble();
                e=new Monthly_based_employee(no,n,b,hra,da);
                e.displayEmployeedata();
                e.calculatesalary();
                break;
            case 2:System.out.println("Enter name");
                String na=sc.next();
                System.out.println("enter empno");
                String no1=sc.next();
                System.out.println("enter no of hours");
                int h=sc.nextInt();
                System.out.println("enter wage");
                double w=sc.nextDouble();
                e=new Contract_Based_employee(no1,na,h,w);
                e.displayEmployeedata();
                e.calculatesalary();
        }
}
}







    



