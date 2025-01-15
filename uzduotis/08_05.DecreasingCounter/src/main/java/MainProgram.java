public class MainProgram {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);
//if we change here 10 or 2 decrement changes

        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.decrement();
        counter.printValue();

    }
}
