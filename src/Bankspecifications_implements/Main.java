package Bankspecifications_implements;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SBI s = new SBI();
        SIDDHUBANK siddhubank = new SIDDHUBANK();
        int c;
        do {
            System.out.println("enter your choice\n1.deposit to SBI\n2.withdraw from SBI\n3.get balance of SBI\n4.deposit to SIDDHUBANK\n5.withdraw from SIDDHUBANK\n6.yearend add percent to balance\n7.get balance of SIDDHUBANK\n8.exit");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("enter amount to be deposited\n");
                    double amount = sc.nextDouble();
                    s.deposit(amount);
                    break;
                case 2:
                    System.out.println("enter amount to be withdrawn\n");
                    double with = sc.nextDouble();
                    s.withdraw(with);
                    break;
                case 3:
                    System.out.printf("balance of sbi is %f\n", s.getBalance());
                    break;
                case 4:
                    System.out.println("enter amount to be deposited\n");
                    double amount1 = sc.nextDouble();
                    siddhubank.deposit(amount1);
                    break;
                case 5:
                    System.out.println("enter amount to be withdrawn\n");
                    double with1 = sc.nextDouble();
                    siddhubank.withdraw(with1);
                    break;
                case 6:
                    System.out.println("yearendaddpercent to siddhubank\n");
                    siddhubank.yearendaddNpercenttoBalance();
                    break;
                case 7:
                    System.out.printf("balance of siddhubank is %f\n", siddhubank.getBalance());
                    break;
                case 8:
                    System.exit(0);

            }


        } while (c != 8);
    }
}


