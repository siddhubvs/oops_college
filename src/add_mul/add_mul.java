package add_mul;
import java.util.Scanner;
public class add_mul {
    int arr[][];

    public add_mul() {
    }

    public add_mul(int rows, int cols) {
        arr = new int[rows][cols];
    }

    void fillmatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter matrix elements");
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++)
                arr[i][j] = sc.nextInt();
    }

    void addmatrix(add_mul obj1, add_mul obj2) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++)
                this.arr[i][j] = obj1.arr[i][j] + obj2.arr[i][j];
    }

    void mulmatrix(add_mul obj1, add_mul obj2) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    this.arr[i][j] = this.arr[i][j] + obj1.arr[i][k] * obj2.arr[k][j];
                }
            }
        }
    }

    void display() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j] + "\t ");
            }
            System.out.println();
        }
    }
}
