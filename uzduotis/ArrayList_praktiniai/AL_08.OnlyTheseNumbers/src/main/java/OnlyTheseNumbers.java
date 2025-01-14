import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();


        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }


        if (numbers.isEmpty()) {
            System.out.println();
            return;
        }

        System.out.print("From where? ");
        int fromIndex = Integer.parseInt(scanner.nextLine());

        System.out.print("To where? ");
        int toIndex = Integer.parseInt(scanner.nextLine());

        if (fromIndex < 0 || toIndex >= numbers.size() || fromIndex > toIndex) {
            System.out.println("Invalid indices. Please ensure the indices are within bounds and valid.");
            return;
        }

        for (int i = fromIndex; i <= toIndex; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
