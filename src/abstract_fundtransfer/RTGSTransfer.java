package abstract_fundtransfer;

public class RTGSTransfer extends FundTransfer {
    public RTGSTransfer(String accountnumber, double balance) {
        super(accountnumber, balance);
    }

    public RTGSTransfer() {
    }

    @Override
    boolean transfer(double transfer) {
       if(transfer>10000){

            balance=balance-transfer;
            return true;
        }
        else
            return false;
    }
}
