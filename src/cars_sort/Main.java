package cars_sort;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter no of car objects");
        int n = sc.nextInt();
        cars c[] = new cars[n];
        for (int i = 0; i < c.length; i++) {
            System.out.printf("enter car no,color,capacity");
            int cn = sc.nextInt();
            String co = sc.next();
            int ca = sc.nextInt();
            c[i] = new cars(cn, co, ca);

        }
        bubbleSort(c);

        for (int i = 0; i < c.length; i++) {
            System.out.printf("%10d%10d%10s\n",c[i].carno,c[i].capacity,c[i].color);
        }
        int i=search(c);
        if(i==-1)
            System.out.println("not possible");
        else
        System.out.printf("%10d%10d%10s\n",c[i].carno,c[i].capacity,c[i].color);


    }

    static void bubbleSort(cars c[]) {
        cars temp;
        for (int i = 0; i < c.length; i++) {
            for (int j = 1; j < (c.length - i); j++) {
                if (c[j - 1].capacity > c[j].capacity) {
                    //swap elements
                    temp = c[j - 1];
                    c[j - 1] = c[j];
                    c[j] = temp;
                }

            }
        }

    }

    static int search(cars c[]) {
        String color;
        System.out.println("enter color");


        color = sc.next();
        for (int i = 0; i < c.length; i++) {
            if (color == c[i].color) {
                return i;

            }
        }
        return -1;


    }
}


