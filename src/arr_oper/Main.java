package arr_oper;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int r;
        System.out.println("enter size of matrix");
        r = sc.nextInt();

        arr_oper obj1 = new arr_oper(r);
        obj1.fillmatrix();


        int choice;

        do {
            System.out.println("enter choice\n1.sum\n2.average\n3.maximum\n4.minimum\n5.linear search\n6.display\n7.binarysearch\n8.exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int sum = obj1.arraysum();
                    System.out.println("sum is " + sum);
                    break;
                case 2:
                    double aver = obj1.average();
                    System.out.println("average is " + aver);
                    break;
                case 3:
                    int max = obj1.max();
                    System.out.println("max element is " + max);
                    break;
                case 4:
                    int min = obj1.min();
                    System.out.println("min element is " + min);
                    break;
                case 5:
                    int x = obj1.search();
                    System.out.println("element is found at " + x + " position");
                    if (x == -1)
                        System.out.println("element is not found");
                    break;
                case 6:
                    obj1.display();
                    break;
                case 7:
                    obj1.binarysearch();
                    break;
                case 8:
                    System.exit(0);
            }
        } while (choice != 8);
    }
}




