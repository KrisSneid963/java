import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username1 = "alex";
        String password1 = "sunshine";
        String username2 = "emma";
        String password2 = "haskell";

        System.out.println("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.println("Enter password: ");
        String enteredPassword = scanner.nextLine();

        boolean isValid = (enteredUsername.equals(username1) && enteredPassword.equals(password1)) ||
                (enteredUsername.equals(username2) && enteredPassword.equals(password2));

        if (isValid) {
            System.out.println("You have successfully logged in ");
        } else {
            System.out.println("Incorrect username or password ");
        }

        scanner.close();
    }
}
