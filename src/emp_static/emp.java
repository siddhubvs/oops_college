package emp_static;

public class emp {
    int empno;
    String Name;
    double Basic_salary;
    double netsalary;
    static String cn;
    static double totalsalary;
    static {
        cn="CVRCE";
    }

    public emp() {
    }

    public emp(int empno, String name, double basic_salary) {
        this.empno = empno;
        Name = name;
        Basic_salary = basic_salary;

    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setBasic_salary(double basic_salary) {
        Basic_salary = basic_salary;
    }

    void compute_netsalary(){
        if(Basic_salary>=12000)
            this.netsalary=Basic_salary+Basic_salary*.2+Basic_salary*.8-Basic_salary*.12;
        else
            this.netsalary=Basic_salary+Basic_salary*.15+Basic_salary*.5-Basic_salary*.12;
        totalsalary=totalsalary+netsalary;
    }

    public int getEmpno() {
        return empno;
    }

    public String getName() {
        return Name;
    }

    public double getBasic_salary() {
        return Basic_salary;
    }


    void display(){
        System.out.println("Empno : "+this.empno);
        System.out.println("Empname : "+this.Name);
        System.out.println("Empnetsalary : "+this.netsalary);
    }
    static void displaytotalsalary(){
        System.out.printf("\n\t\t\tTotalSalary=%12.2f",totalsalary);
    }


    @Override
    public String toString() {
        return "Empno : "+this.empno +"\nEmpname : "+this.Name +"\nEmpnetsalary : "+this.netsalary;
    }

}

