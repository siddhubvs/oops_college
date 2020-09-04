package shape_triangle;


public class Main {
    public static void main(String[] args) {
        rectangle r=new rectangle(10,10);
        triangle t=new triangle(3,4,5);

        r.computeArea();
        r.computePerimeter();
        t.computeArea();
        t.computePerimeter();
        r.display();
        t.display();
    }

    }






