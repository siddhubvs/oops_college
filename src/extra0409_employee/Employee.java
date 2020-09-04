package extra0409_employee;

public abstract class Employee {
    String empno;
    String name;

    public Employee(String empno, String name) {
        this.empno = empno;
        this.name = name;
    }
    void displayEmployeedata(){
        System.out.println("Employee name is "+name);
        System.out.println("Employee number is "+empno);
    }
    abstract void calculatesalary();
}
