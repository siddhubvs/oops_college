package Event;

public class Event {
    String eventtype;
    String eventname;
    int No_of_registrations;

    public void setEventtype(String eventtype) {
        this.eventtype = eventtype;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public void setNo_of_registrations(int no_of_registrations) {
        No_of_registrations = no_of_registrations;
    }

    public String getEventtype() {
        return eventtype;
    }

    public String getEventname() {
        return eventname;
    }

    public int getNo_of_registrations() {
        return No_of_registrations;
    }
}
