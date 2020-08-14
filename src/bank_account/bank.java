package bank_account;

public class bank {
    private String accountholder_name;
    private String account_number;
    private double balance;

    public bank() {
    }

    public bank(String accountholder_name, String account_number, double balance) {
        this.accountholder_name = accountholder_name;
        this.account_number = account_number;
        this.balance = balance;
    }

    public void setAccountholder_name(String accountholder_name) {
        this.accountholder_name = accountholder_name;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountholder_name() {
        return accountholder_name;
    }

    public String getAccount_number() {
        return account_number;
    }

    public double getBalance() {
        return balance;
    }
    void deposit(double amount){
        balance=balance+amount;
    }
    void withdraw(double amount){
        if(balance<=0)
            System.out.println("insufficient balance");
        balance=balance-amount;
    }

    @Override
    public String toString() {
        return "account_holder name : "+this.accountholder_name+"\naccount_holdernumber"+this.account_number+"\nbalance"+this.balance;
    }
}
