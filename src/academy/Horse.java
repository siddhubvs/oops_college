package academy;

public class Horse {
    int age;
    double weight;
    String color;

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
    public void display(){
        System.out.println("age is "+getAge());
        System.out.println("color is "+getColor());
        System.out.println("weight is "+getWeight());
    }
}

