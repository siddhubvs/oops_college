package extra0409_employee;

public class Monthly_based_employee extends Employee {
    double basicpay;
    double hra;
    double da;

    public Monthly_based_employee(String empno, String name, double basicpay, double hra, double da) {
        super(empno, name);
        this.basicpay = basicpay;
        this.hra = hra;
        this.da = da;
    }

    @Override
    void calculatesalary() {
        double netsalary=basicpay+hra*basicpay+da*basicpay;
        System.out.printf("netsalary of employee is %.3f",netsalary);
    }
}
class Contract_Based_employee extends Employee{
    int noofhours;
    double wage;

    public Contract_Based_employee(String empno, String name, int noofhours, double wage) {
        super(empno, name);
        this.noofhours = noofhours;
        this.wage = wage;
    }

    @Override
    void calculatesalary() {
        double netsalary=wage;
        System.out.printf("netsalary of employee is %.3f",netsalary);
    }
}
