import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));
        numbers.sort((x, y) -> y - x); //if desc x - y
        System.out.println(numbers);
    }
}