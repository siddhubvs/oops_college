package bank_account;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String an, no;
        double ba;
        System.out.println("enter accountholdername,accountholdernumber,balance");
        an = sc.nextLine();
        no = sc.nextLine();
        ba = sc.nextDouble();

        bank b = new bank(an, no, ba);



        int i;
        do {
            System.out.println("enter your choice\n1.deposit\n2.withdraw\n3.display\n4.exit");
             i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("enter amount to be deposited\n");
                    double amount = sc.nextDouble();
                    b.deposit(amount);
                    break;
                case 2:
                    System.out.println("enter amount to be withdrawed\n");
                    double amount1 = sc.nextDouble();
                    b.withdraw(amount1);
                    break;
                case 3:
                    System.out.println(b);
                    break;
                case 4:System.exit(0);
            }


        }while(i!= 4);
        System.out.println(b);
    }
}








