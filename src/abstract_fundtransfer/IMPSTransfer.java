package abstract_fundtransfer;

public class IMPSTransfer extends FundTransfer {
    public IMPSTransfer() {
    }

    public IMPSTransfer(String accountnumber, double balance) {
        super(accountnumber, balance);
    }

    @Override
    boolean transfer(double transfer) {
        double t=transfer+(transfer*2)/100;
        if(balance>t){
            balance=balance-t-(0.2*balance);
            return true;
        }
        else
            return false;
    }
}
