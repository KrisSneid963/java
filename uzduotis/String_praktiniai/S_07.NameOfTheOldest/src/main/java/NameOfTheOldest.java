import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfOldest = "";
        int oldestAge = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");

            String name = parts[0];
            int age = Integer.parseInt(parts[1]);

            if (age > oldestAge) {
                oldestAge = age;
                nameOfOldest = name;
            }
        }

        scanner.close();

        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
