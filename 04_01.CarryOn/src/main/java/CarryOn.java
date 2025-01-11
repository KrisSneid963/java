
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        while (!response.equalsIgnoreCase("no")) {
            System.out.println("Shall we carry on?");
            response = scanner.nextLine();
            
        }
        System.out.println("Program ended");
    }
}
