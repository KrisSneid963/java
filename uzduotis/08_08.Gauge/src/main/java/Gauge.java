
public class Gauge {
    private int value;

    // Constructor
    public Gauge() {
        this.value = 0;
    }

    //increase by 1, doesnt exceed 5
    public void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }

    //  - value by 1, doesn't go below 0
    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        return this.value == 5;
    }
}
