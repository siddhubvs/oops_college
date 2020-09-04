package student;

public class Main {

    public static void main(String[] args) {
       Student student1=new Student();
       Student student2=new Student();

       student1.setdata(123,"raju","hyderabad");
       student2.setdata(124,"asif","secunderabad");
        System.out.println("student 1 details are\n");
       student1.display();
        System.out.println("student 2 details are\n");
       student2.display();


    }
}



