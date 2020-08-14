



package circle;
public class Main {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        Circle circle2=new Circle();

        circle1.setRadius(4);
        double a=circle1.computearea();
        System.out.println("area of circle 1 is "+ a);
        double b=circle1.comuteperimeter();
        System.out.println("perimeter of circle 1 is " + b);

        circle2.setRadius(8);
        double c=circle2.computearea();
        System.out.println("area of circle 2 is " + c);
        double d=circle2.comuteperimeter();
        System.out.println("perimeter of circle 2 is "+d);



    }

}
