public class Song {

    private String name;
    private int length;

    // Constructor
    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    // returning song
    public String name() {
        return this.name;
    }

    //returning song's length
    public int length() {
        return this.length;
    }
}
