package bank_hierachy;

public class savings extends BankAccount {
    double intrestRate;
    savings(){                        }
    savings(String acno,String acname,double intrestRate)
    {
        super(acno,acname);
        this.intrestRate=intrestRate;
    }
    void updateMonthEndBalance()
    {
        double amount=(getBalance()+(getBalance()*(intrestRate/12)));
        System.out.println("amount:"+amount);
    }
}
class Current extends BankAccount
{
    Current(){}
    double serviceCharge;
    Current(String acno,String acname,double serviceCharge)
    {
        super(acno,acname);
        this.serviceCharge=serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    void updateMonthEndBalance()
    {
        double amount=(getBalance()-(getBalance()*(serviceCharge/12)));
        System.out.println("amount:"+amount);
    }
}
