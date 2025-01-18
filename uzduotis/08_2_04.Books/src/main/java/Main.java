import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Books book = new Books(title, pages, publicationYear);
            books.add(book);  //adding books to display after entered


//            System.out.println("" + book); if we want to print before we enter word everything
////
        }
        System.out.print("What information will be printed? "); //need to enter Everything
        String choice = scanner.nextLine().trim().toLowerCase();


        if (choice.equals("everything")) {
            for (Books book : books) {
                System.out.println(book);
            }
        } else if (choice.equals("name")) {
            for (Books book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}