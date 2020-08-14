package cinemabook;


import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int r, c, m, n;
        System.out.println("enter rows and cols of cinema hall");
        r = sc.nextInt();
        c = sc.nextInt();
        CinemaTicket ticket = new CinemaTicket(r, c);
        int choice;
        do {
            System.out.println("enter choice\n1.booking at any\n2.booking at front\n3.booking at back\n4.leftseats\n5.display");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ticket.BookingOption1();
                    break;
                case 2:
                    ticket.BookingOption2();
                    break;
                case 3:
                    ticket.BookingOption3();
                    break;
                case 4:
                    int count = ticket.leftseats();
                    System.out.println("left seats " + count);
                    break;
                case 5:
                    ticket.display();
                    break;
                case 6:
                    System.exit(0);

            }
        } while (choice != 6);
    }
}





