public class MainProgram {
    public static void main(String[] args) {

        Counter counter1 = new Counter();

        Counter counter2 = new Counter(10);
        System.out.println("Initial value: " + counter2.value());

        counter2.increase();
        System.out.println("After added 5: " + counter2.value()); //++

        counter2.decrease();
        System.out.println("After minus 3: " + counter2.value()); // --


        counter2.increase(5);
        System.out.println("After increase by 5: " + counter2.value()); // 15

        counter2.decrease(3);
        System.out.println("After decrease by 3: " + counter2.value()); // 12

    }
}
