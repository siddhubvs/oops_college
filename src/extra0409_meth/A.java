package extra0409_meth;

public interface A {void meth1();
    void meth2();
}
interface B extends A
{
    void meth3();
}
class C implements B
{
    public void meth1()
    {
        System.out.println("call meth1:");
    }
    public void meth2()
    {
        System.out.println("call meth2:");
    }
    public void meth3()
    {
        System.out.println("call meth3:");
    }
}


