package Bankspecifications_default;

public interface Bankspecificationsd {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
    default void yearendaddnpercentobalance(){
        System.out.println("It adds n percent to the existing balance");
        System.out.println("if account holder continues to make minimum number of transactions in the current year\n");

    }

}
class SBI implements Bankspecificationsd {
    double balance;

    public SBI() {
        balance=0;
    }

    @Override
    public void deposit(double amount) {
        balance=balance+amount;
    }

    @Override
    public void withdraw(double amount) {
        if(balance-amount>0)
            balance=balance-amount;
        else
            System.out.println("balance is insufficient");
    }

    @Override
    public double getBalance() {
        return balance;
    }


}
class SIDDHUBANK implements Bankspecificationsd {
    double balance;

    public SIDDHUBANK() {
        balance = 0;
    }


    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount > 0)
            balance = balance - amount;
        else
            System.out.println("insufficient balance");
    }



    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void yearendaddnpercentobalance() {
        balance=balance+(5*balance)/100;
    }
}

