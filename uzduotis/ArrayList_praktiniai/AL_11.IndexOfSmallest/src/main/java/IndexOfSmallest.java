import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();


        while (true) {
            //valueOf is the same as ParseInt
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 999) {
                break;
            }
            numbers.add(input);
        }

        int smallest = numbers.get(0);
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Smallest number: " + smallest);


        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
