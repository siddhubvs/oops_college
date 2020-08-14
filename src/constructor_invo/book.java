package constructor_invo;

public class book {
    String name;
    String gender;
    String email;

    public book(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public book(String name,String gender) {
        this.name = name;
        this.gender =gender;

    }
    void display(){
        System.out.println("name is : "+ this.name + " gender is "+ this.gender+" email is "+this.email);
    }
    void display1(){
        System.out.println("name is : "+ this.name + " gender is "+ this.gender);
    }

}
