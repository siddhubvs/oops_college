package constructor_invo;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        book book1=new book("sid","m","123@gmail.com");
        book book2=new book("raj","f");

        book1.display();
        book2.display1();


    }
}


