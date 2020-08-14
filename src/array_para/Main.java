package array_para;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        arrpara ar = new arrpara();
        System.out.println("Enter size");

        int SIZE = sc.nextInt();    // Size of the array

        // Create an array.
        int[] array = new int[SIZE];

        // Pass the array to the fillArray method.
        ar.fillArray(array, SIZE);
        System.out.println("Numbers are :");

        // Pass the array to the printArray method.
        ar.printArray(array, SIZE);
    }
}











