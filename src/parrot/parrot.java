package parrot;

public class parrot {
    String name;
    String color;
    int age;

    public parrot(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public parrot(parrot p1) {
        this.name= p1.name;
        this.age= p1.age;
        this.color= p1.color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
    void display(){
        System.out.println("Name is "+this.getName()+" color is"+this.getColor()+ " age is "+this.getAge());
    }
}
