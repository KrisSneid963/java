public class Book implements Packables {
    private String author;
    private String name;
    private double weight;

    // Constructor for books with weight
    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    // Constructor for books without weight (default weight is 0)
    public Book(String author, String name) {
        this.author = author;
        this.name = name;
        this.weight = 0; // Default weight
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        if (this.weight == 0) {
            return this.author + ": " + this.name; // No weight in the output
        }
        return this.author + ": " + this.name + " (" + this.weight + " kg)";
    }
}
