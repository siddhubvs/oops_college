package Vehicle_maxspeed_person_student;

public class Vehicle {
    int maxspeed=120;
    
}
class Car extends Vehicle{
    int maxspeed=180;
    void display(){
        System.out.printf("Maximum speed of car is %d\n",super.maxspeed);
    }

}
