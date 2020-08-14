package net_salary;

public class Employee {
    private int empno;
    private String Name;
    private double Basic_salary;
    private double netsalary;

    public Employee() {
    }

    public Employee(int empno, String name, double basic_salary) {
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

    @Override
    public String toString() {
        return "Empno : "+this.empno +"\nEmpname : "+this.Name +"\nEmpnetsalary : "+this.netsalary;
    }
}





