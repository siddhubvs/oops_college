package abstract_fundtransfer;

public class NEFTTransfer extends FundTransfer {
    public NEFTTransfer() {
    }
    public NEFTTransfer(String accountnumber,double balance){
        super(accountnumber,balance);
    }

    @Override
    boolean transfer(double transfer) {
        double t=transfer+(transfer*5)/100;
        if(balance>t){
            balance=balance-t;
            return true;
        }
        else
            return false;
    }
}
