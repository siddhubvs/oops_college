package Song;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
      Song song=new Song();
        System.out.println("enter title");
        String title=sc.nextLine();
        song.setTitle(title);
        System.out.println("enter artist");
        String artist=sc.nextLine();
        song.setArtist(artist);

        song.display();





    }
}


