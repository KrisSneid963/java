public class Statistics {
    private int sum;
    private int count;

    // Constructor
    public Statistics() {
        this.sum = 0;
        this.count = 0;
    }

    // Method to add a number
    public void addNumber(int number) {
        this.sum += number; // Increment the sum by the added number
        this.count++;       // Increment the count
    }

    //all numbers
    public int getCount() {
        return this.count;
    }

    //  sum of added numbers
    public int sum() {
        return this.sum;
    }

    // calculate the average of added numbers
    public double average() {
        if (this.count == 0) {
            return 0; // Avoid division by zero
        }
        return (double) this.sum / this.count;
    }
}
