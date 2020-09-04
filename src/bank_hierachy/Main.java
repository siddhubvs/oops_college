package bank_hierachy;


import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String an, no;
        double ba;



        System.out.println("enter accountholdername,accountholdernumber,interestrate");
         String   an1 = sc.nextLine();
         String no1 = sc.next();
        double ba1 = sc.nextDouble();
        savings account1=new savings(an1,no1,ba1);

        System.out.println("enter accountholdername,servicecharge,accountholdername");
        an = sc.nextLine();
        no = sc.next();
        ba=sc.nextDouble();

        Current account2=new Current(an,no,ba);
        System.out.println("Enter service charge");
        double src=sc.nextDouble();
        account2.setServiceCharge(src);


        System.out.println("enter balance of account 1");
        int bal=sc.nextInt();
        account1.setBalance(bal);
        System.out.println("enter amount to be deposited to account1");
        int depos=sc.nextInt();
        account1.deposit(depos);
        System.out.println("enter amount to be withdrawn from account 1");
        int with=sc.nextInt();
        account1.withdraw(with);
        account1.display();
        System.out.println("enter balance of account 2");
        int bal1=sc.nextInt();
        account2.setBalance(bal1);
        System.out.println("enter amount to be deposited to account2");
        int depos1=sc.nextInt();
        account2.deposit(depos1);
        System.out.println("enter amount to be withdrawn from account 2");
        int with1=sc.nextInt();

        account2.withdraw(with1);
        account2.display();
        account1.updateMonthEndBalance();
        account2.updateMonthEndBalance();

    }


    }



