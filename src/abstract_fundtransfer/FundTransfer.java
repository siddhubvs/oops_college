package abstract_fundtransfer;

public abstract class FundTransfer {
    String accountnumber;
    double balance;

    public FundTransfer(String accountnumber, double balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public FundTransfer() {
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public double getBalance() {
        return balance;
    }
    boolean validate(double transfer){
        if(accountnumber.length()==10 && transfer>0&&transfer<balance)
            return true;
        else
            return false;
    }
    abstract boolean transfer(double transfer);
}
