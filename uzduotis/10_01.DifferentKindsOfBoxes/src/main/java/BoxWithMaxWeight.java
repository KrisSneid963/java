import java.util.ArrayList;
import java.util.List;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private List<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }


    @Override
    public void add(Item item) {
        if (item.getWeight() <= capacity) {
            items.add(item);
            capacity -= item.getWeight();
        }
    }


    @Override
    public boolean isInBox(Item item) {
        for (Item value : items) {
            if (item.equals(value)) {
                return true;
            }
        }
        return false;
    }
}