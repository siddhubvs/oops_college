package circle_interface;

public class circle implements Figure {
    double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void ComputeArea() {
        double area=PI*radius*radius;
        System.out.printf("Area of circle is %.2f\n",area);
    }

    @Override
    public void ComputePer() {
        double perimeter=2*PI*radius;
        System.out.printf("Perimeter of circle is %.2f\n",perimeter);
        }
    }

