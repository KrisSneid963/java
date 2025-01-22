import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountSpecificItems {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "orange", "apple", "banana", "apple"));
        final int[] count = {0};
        fruits.forEach(fruit -> {
            if (fruit.equals("apple")) {
                count[0]++;
            }
        });
        System.out.println("The word 'apple' appears " + count[0] + " times.");
    }
}
