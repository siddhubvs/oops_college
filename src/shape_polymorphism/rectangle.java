package shape_polymorphism;

public class rectangle extends shape {
    double area;
    rectangle(double dim1,double dim2)
    {
        super(dim1,dim2);
    }
    void computeArea()
    {
        area=dim1*dim2;
        System.out.println("Area of rectangle is:"+area);
    }
}
