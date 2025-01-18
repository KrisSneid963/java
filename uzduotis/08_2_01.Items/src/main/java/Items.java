import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();  //items objects
        Scanner scanner = new Scanner(System.in);  //reads input

        while (true) {   //cycle to input names infinitive
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) { //pressed enter without anything entered: stops and displays items created
                break;
            }

            items.add(new Item(name)); //if entered displays item
        }

        for (Item item : items) {  //goes through all list
            System.out.println(item);
        }
    }
}
