package Song;

public class Song {
    String title;
    String artist;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
    public void display(){
        System.out.println("Title is "+ title);
        System.out.println("Artist is "+ artist);
    }
}
