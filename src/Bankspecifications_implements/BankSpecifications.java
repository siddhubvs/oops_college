package Bankspecifications_implements;

public interface BankSpecifications {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);

}
interface PBspecifications extends BankSpecifications {
    void yearendaddNpercenttoBalance();
}
class SBI implements BankSpecifications{
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
class SIDDHUBANK implements PBspecifications{
    double balance;

    public SIDDHUBANK() {
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
             System.out.println("insufficient balance");
    }

    @Override
    public void yearendaddNpercenttoBalance() {
            balance=balance+(5*balance)/100;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
