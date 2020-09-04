package shape_triangle;

public class triangle extends shape {
    int area,perimeter,dim3;
    triangle(int dim1,int dim2,int dim3)
    {
        super(dim1,dim2);
        this.dim3=dim3;
    }
    void computeArea()
    {
        area=(dim2*dim3)/2;
    }
    void computePerimeter()
    {
        perimeter=(dim1+dim2+dim3);
    }
    void display()
    {
        System.out.println("Area of triangle is :"+area);
        System.out.println("perimeter of triangle is :"+perimeter);
    }
}
