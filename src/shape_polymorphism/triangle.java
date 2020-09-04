package shape_polymorphism;

public class triangle extends shape {
    double dim3,area;
    triangle(double dim1,double dim2,double dim3)
    {
        super(dim1,dim2);
        this.dim3=dim3;
    }
    void computeArea()
    {
        double s = (dim3+dim2+dim1)/2;
        area=Math.sqrt(s*(s-dim1)*(s-dim2)*(s-dim3));
        System.out.println("Area of triangle is:"+area);
    }
}
