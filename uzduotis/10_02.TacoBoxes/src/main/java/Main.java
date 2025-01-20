public class Main {
    public static void main(String[] args) {
        // Testing TripleTacoBox
        TripleTacoBox tripleBox = new TripleTacoBox();
        System.out.println("Triple Taco Box: " + tripleBox.tacosRemaining()); // 3
        tripleBox.eat();
        System.out.println("After eating one: " + tripleBox.tacosRemaining()); // 2

        // Testing CustomTacoBox
        CustomTacoBox customBox = new CustomTacoBox(5);
        System.out.println("Custom Taco Box: " + customBox.tacosRemaining()); // 5
        customBox.eat();
        customBox.eat();
        System.out.println("After eating two: " + customBox.tacosRemaining()); // 3
    }
}
