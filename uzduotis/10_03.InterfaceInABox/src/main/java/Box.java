import java.util.ArrayList;
import java.util.List;

public class Box implements Packables {
    private double maxCapacity;
    private List<Packables> items;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packables item) {
        if (item == this) {
            throw new IllegalArgumentException("A box cannot contain itself!");
        }
        if (this.weight() + item.weight() <= this.maxCapacity) {
            this.items.add(item);
        }
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packables item : this.items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + String.format("%.1f", this.weight()) + " kg";
    }
}
//"%.1f" for Strings 1dec  If this.weight() returns 5.6789, String.format("%.1f", this.weight())
// will return "5.7". ref - Main