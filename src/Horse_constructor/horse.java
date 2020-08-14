package Horse_constructor;

public class horse {


        int age;
        double weight;
        String color;

    public horse(int age, double weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

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
    }

