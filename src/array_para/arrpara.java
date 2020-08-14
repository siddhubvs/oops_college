package array_para;

import java.util.Scanner;

public class arrpara {
    public static void fillArray(int[] list, int n)
    {
        // Create a Scanner object for keyboard input.
        Scanner console = new Scanner(System.in);

        System.out.println("Enter " + n + " integers");

        for (int i = 0; i < n; i++)
        {
            list[i] = console.nextInt();
        }
    }


    public static void printArray(int[] list, int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(list[i] + " ");
        }
    }
}

