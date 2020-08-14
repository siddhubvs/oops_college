package add_mul;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
    int r,c,m,n;
        System.out.println("enter rows and cols of matrix 1");
        r= sc.nextInt();
        c= sc.nextInt();
        add_mul obj1=new add_mul(r,c);
        obj1.fillmatrix();
        obj1.display();
        System.out.println("enter rows and cols of matrix 2");
        m= sc.nextInt();
        n= sc.nextInt();
        add_mul obj2=new add_mul(m,n);
        obj2.fillmatrix();
        add_mul obj3=new add_mul(r,n);
        obj3.addmatrix(obj1,obj2);
        add_mul obj4=new add_mul(r,n);
        obj4.mulmatrix(obj1,obj2);
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }

}


