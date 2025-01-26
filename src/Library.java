import java.util.*;
import java.util.stream.Collectors;

public class Library {
    public static void main(String[] args) {

        List<Book> books = List.of(
                new Fiction("The Great Gatsby", "F. Scott Fitzgerald", 1925),
                new NonFiction("Sapiens", "Yuval Noah Harari", 2011),
                new Fiction("To Kill a Mockingbird", "Harper Lee", 1960),
                new NonFiction("Educated", "Tara Westover", 2018)
        );


        List<User> users = List.of(
                new User("Alice", "alice@example.com"),
                new User("Bob", "bob@example.com"),
                new User("Charlie", "charlie@example.com")
        );


        System.out.println("All Books:");
        books.forEach(System.out::println);

        //  Streams and Lambdas
        System.out.println("\nFiction Books:");
        books.stream()
                .filter(book -> book instanceof Fiction) // Lambda for filtering
                .forEach(System.out::println);

        //by name using Stream
        System.out.println("\nUsers Sorted by Name:");
        users.stream()
                .sorted(Comparator.comparing(User::getName)) // Lambda for sorting
                .forEach(System.out::println);

        // Count NonFiction books
        long nonFictionCount = books.stream()
                .filter(book -> book instanceof NonFiction)
                .count();
        System.out.println("\nNumber of NonFiction Books: " + nonFictionCount);

        // Map users to their emails
        System.out.println("\nUser Emails:");
        List<String> emails = users.stream()
                .map(User::getEmail) // Lambda to extract emails
                .collect(Collectors.toList());
        emails.forEach(System.out::println);
    }
}
