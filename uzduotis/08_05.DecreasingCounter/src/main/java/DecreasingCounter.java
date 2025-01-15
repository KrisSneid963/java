public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter
    private int initialValue; // a variable to store the initial value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
        this.initialValue = initialValue; // Store the initial value for resetting
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        if (this.value > 0) {
            this.value--; // Decrease the value only if it's greater than 0
        }
    }

    // the other methods go here
    // Method to reset the counter to its initial value
    public void reset() {
        this.value = 0; // Reset the value to 0
    }

    // Method to set the counter back to its original initial value
    public void setInitial() {
        this.value = this.initialValue; // Reset to the initial value
    }
}
