package bank_hierachy;

public class BankAccount {
    String acno;
    String acname;
    double balance;
    BankAccount(){                      }
    BankAccount(String acno,String acname)
    {
        this.acno=acno;
        this.acname=acname;
    }
    void deposit(double amount)
    {
        this.balance=this.balance+amount;
    }
    void withdraw(double amount)
    {
        if(balance<=0)
            System.out.println("insufficient balance");
        balance=balance-amount;
    }
    void setBalance(double balance)
    {
        this.balance=balance;
    }
    double getBalance()
    {
        return this.balance;
    }
    void display()
    {
        System.out.println("balance is :"+balance);
    }
}
