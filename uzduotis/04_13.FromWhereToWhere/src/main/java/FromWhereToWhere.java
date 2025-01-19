
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int biggerNumber = scanner.nextInt();

        System.out.print("Where from? ");
        int startingNumber = scanner.nextInt();

        if (startingNumber <= biggerNumber) {
            for (int i = startingNumber; i <= biggerNumber; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println(("nothing to print for you "));
        }
        scanner.close();


    }
}

