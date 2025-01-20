import java.util.Objects;

public class Item extends Box {

    private String name;
    private int weight;


    public Item(String name, int weight) {
        super();
        this.name = name;
        this.weight = weight;
    }


    public Item(String name) {
        this(name, 0);
    }


    public String getName() {
        return name;
    }


    public int getWeight() {
        return weight;
    }

    // hashCode alt insert
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public void add(Item item) {
    }

    @Override
    public boolean isInBox(Item item) {
        return "Box".contains(item.getName());
    }
}
