package cone_inherit;

public class circle {
    int radius;

    public circle() {
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    double computearea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}

