package Bankspecifications_default;


import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SBI s = new SBI();
        SIDDHUBANK siddhubank = new SIDDHUBANK();
        int c;
        do {
            System.out.println("enter your choice\n1.deposit to SBI\n2.withdraw from SBI\n3.get balance of SBI\n4.yearendbalancetosbi\n5.deposit to SIDDHUBANK\n6.withdraw from SIDDHUBANK\n7.yearend add percent to balance\n8.get balance of SIDDHUBANK\n9.exit");
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
                case 4:System.out.println("yearendaddpercent to sbi\n");
                       s.yearendaddnpercentobalance();
                       break;

                case 5:
                    System.out.println("enter amount to be deposited\n");
                    double amount1 = sc.nextDouble();
                    siddhubank.deposit(amount1);
                    break;
                case 6:
                    System.out.println("enter amount to be withdrawn\n");
                    double with1 = sc.nextDouble();
                    siddhubank.withdraw(with1);
                    break;
                case 7:
                    System.out.println("yearendaddpercent to siddhubank\n");
                    siddhubank.yearendaddnpercentobalance();
                    break;
                case 8:
                    System.out.printf("balance of siddhubank is %f\n", siddhubank.getBalance());
                    break;
                case 9:
                    System.exit(0);

            }


        } while (c != 8);
    }
}


