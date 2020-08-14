package operations;

public class logical_operayions {
    int a, b, c;

    void logical_and(int a, int b, int c) {
        boolean r;
        r = a > b && a > c;
        System.out.println("it is " + r);

    }

    void logical_or(int a, int b, int c) {
        boolean s;
        s = a > b || a > c;
        System.out.println("it is " + s);


    }
}
