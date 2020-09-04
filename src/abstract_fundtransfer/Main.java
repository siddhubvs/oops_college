package abstract_fundtransfer;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter accountnumber");
        String ac = sc.next();
        System.out.println("enter balance");
        double balance = sc.nextDouble();
        System.out.println("1.NEFT");
        System.out.println("2.IMPS");
        System.out.println("3.RTGS");
        int n;
        n = sc.nextInt();
        FundTransfer obj = null;

            switch (n) {
                case 1:
                    obj = new NEFTTransfer(ac, balance);
                    break;

                case 2:obj = new IMPSTransfer(ac, balance);


                break;

                case 3:
                    obj = new RTGSTransfer(ac, balance);



                    break;
                default:return;
            }
        System.out.println("Enter the amount to be transferred\n");
        double amount=sc.nextDouble();
        if(obj.validate(amount)==false)
            System.out.println("Account number or transfer amount seems to be wrong\n");
        else
        if(obj.transfer(amount)==false)
            System.out.println("Transfer could not be made\n");
        else {
            System.out.println("Transfer occured successfully\n");
            System.out.println("Remaining balance is " + obj.getBalance());
        }



    }
}


