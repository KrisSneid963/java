import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();


        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            names.add(input);
        }


        System.out.println(names.get(2));
     

    }
}

