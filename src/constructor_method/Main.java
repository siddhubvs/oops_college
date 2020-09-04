package constructor_method;

import java.util.Scanner;
class A{
    void m(){System.out.println("hello m");}
    void n(){
        System.out.println("hello n");
//m();//same as this.m()
        this.m();
    }
}

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        A a=new A();
        a.n();
    }

    }






