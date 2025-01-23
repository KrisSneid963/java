import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num > 0) //only positives
                .collect(Collectors.toList());
    }
    
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(-5);
        numbers.add(3);
        numbers.add(0);
        numbers.add(7);
        numbers.add(-2);

        List<Integer> positives = positive(numbers);
        System.out.println("Positive numbers: " + positives);
    }
}
