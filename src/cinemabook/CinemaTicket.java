package cinemabook;

import java.util.Scanner;

public class CinemaTicket {
    Scanner sc = new Scanner(System.in);
    int tic[][];

    public CinemaTicket() {
    }

    public CinemaTicket(int rows, int cols) {
        this.tic = new int[rows][cols];
    }

    void BookingOption1() {
        boolean booked = false;

        do {
            System.out.println("enter row number and column number");
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (tic[r][c] == 1)
                System.out.println("seat is already booked");
            else {
                System.out.println("seat is empty");
                tic[r][c] = 1;
                System.out.println("seat is booked for you");
                booked = true;
            }
        } while (booked == false);
    }

    void BookingOption2() {
        System.out.println("Booking seat at front");
        for (int row = 0; row < tic.length; row++) {
            for (int col = 0; col < tic[0].length; col++) {
                if (tic[row][col] == 0) {
                    System.out.println("booking seat");
                    System.out.println("row is "+row+" col is"+col);
                    tic[row][col] = 1;
                    return;


                }


            }

        }
        System.out.println("cinema hall is full");


    }

    void BookingOption3() {
        System.out.println("Booking seat at back");
        for (int row = tic.length - 1; row > 0; row--) {
            for (int col = tic[0].length - 1; col > 0; col--) {
                if (tic[row][col] == 0) {
                    System.out.println("booking seat");
                    System.out.println("row is "+row+"col is "+col);

                    tic[row][col] = 1;
                    return;
                }
            }
        }
        System.out.println("cinema hall is full");
    }

    int leftseats() {
        int count = 0;
        for (int row = 0; row < tic.length; row++) {
            for (int col = 0; col < tic[0].length; col++) {
                if (tic[row][col] == 0)
                    count++;
            }

        }
        return count;
    }

    void display() {
        for (int row = 0; row < tic.length; row++) {
            for (int col = 0; col < tic[0].length; col++) {
                System.out.printf("%d\t",tic[row][col]);
            }
            System.out.println();
        }
    }
}

