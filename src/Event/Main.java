package Event;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Event event=new Event();
        System.out.println("EventType: ");
        String eventtype=sc.nextLine();
        event.setEventtype(eventtype);
        System.out.println("EventName: ");
        String eventname=sc.nextLine();
        event.setEventname(eventname);
        System.out.println("Number of Registrations: ");
        int no_of_registrations=sc.nextInt();
        event.setNo_of_registrations(no_of_registrations);

        System.out.println("Event Type is " + event.getEventtype());
        System.out.println("Event Name is " + event.getEventname());
        System.out.println("Number of registrations are "+ event.getNo_of_registrations());


    }
}


