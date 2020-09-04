package rectangle_shape;


public class Main {
    public static void main(String[] args) {
        rectangle r=new rectangle(10,10);
        rectangle_prism R= new rectangle_prism(10,10,80);
        r.setD1(10);
        r.setD2(10);
        R.setD1(3);
        R.setD2(4);
        r.computeArea();
        r.computePerimeter();
        R.computeArea();
        R.computeVolume();
        r.display();
        R.display();
    }

    }








