import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts.length > 0) {
                System.out.println(parts[0]);
            }
        }

        scanner.close();
    }
}
