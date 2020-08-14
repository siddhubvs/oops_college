package method_overload;

public class add {
    int a,b,c;

    public add(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void add(int a, int b){
        int e=a+b;
        System.out.println("sum is "+e);

    }
    void add(int a,int b,int c){
        int d=c+a+b;
        System.out.println("Sum is "+d);
    }

}
