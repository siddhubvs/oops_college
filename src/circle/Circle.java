package circle;

public class Circle {
    double radius;
    double area;
    double perimeter;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double computearea(){
      double  area=  (Math.PI*radius*radius);
        return area;
    }

    double comuteperimeter(){
        double perimter=(2*Math.PI*radius);
        return perimter;

    }
}
