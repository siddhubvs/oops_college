package Vehicle_maxspeed_person_student;

public class Person {
    void message(){
        System.out.println("This is a person class\n");
    }
}
class student extends Person{
    void message(){
        System.out.println("This is a student class\n");

    }
    void display(){
        super.message();
        message();
    }

        }
