package shape_triangle;

public class rectangle extends shape {
    int area,perimeter;
    rectangle(int dim1,int dim2)
    {
        super(dim1,dim2);
    }
    void computeArea()
    {
        area=(dim1*dim2);
    }
    void computePerimeter()
    {
        perimeter=2*(dim1+dim2);
    }
    void display()
    {
        System.out.println("Area of rectangle is :"+area);
        System.out.println("perimeter of rectangle is :"+perimeter);
    }
}
