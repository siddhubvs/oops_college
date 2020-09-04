package rectangle_shape;

public class rectangle_prism extends rectangle{
    int area,volume,dim3;

    public rectangle_prism(int dim1,int dim2,int dim3) {
        super(dim1,dim2);


        this.dim3 = dim3;
    }

    void computeArea()
    {
        area=2*((dim1*dim2)+(dim2*dim3)+(dim3*dim1));
    }
    void computeVolume()
    {
        volume=(dim1*dim2*dim3);
    }
    void display()
    {
        System.out.println("Area of rectangle_prism is :"+area);
        System.out.println("volume of rectangle_prism is :"+volume);
    }
}
