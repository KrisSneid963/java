
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }
//            for (Integer number : numbers) {
//                System.out.println(number);
//            } isskaidys numerius jei vesi pvz 32

            numbers.add(luku);
        }
        for (Integer number : numbers) {
            System.out.println(number);

        }
    }
}
