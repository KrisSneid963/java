import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }

        if (!list.isEmpty()) {
            System.out.println(list.get(list.size() - 1));
        }
    }
}
//   for (String name : list) {
//            System.out.println(name);
//        } prides visus vardus ivestus