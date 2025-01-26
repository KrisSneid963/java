import java.util.*;
import java.util.stream.Collectors;

public class Restaurant {
    public static void main(String[] args) {

        List<MenuItem> menu = List.of(
                new MainCourse("Spaghetti Carbonara", 12.99),
                new MainCourse("Grilled Salmon", 18.99),
                new Drink("Coca Cola", 2.99),
                new Drink("Orange Juice", 3.99),
                new Dessert("Chocolate Cake", 6.99),
                new Dessert("Cheesecake", 7.49)
        );


        System.out.println("Full Menu:");
        menu.forEach(System.out::println);


        System.out.println("\nDrinks Menu:");
        menu.stream()
                .filter(item -> item instanceof Drink)
                .forEach(System.out::println);


        System.out.println("\nMenu Sorted by Price:");
        menu.stream()
                .sorted(Comparator.comparingDouble(MenuItem::getPrice)) // Sort by price
                .forEach(System.out::println);


        List<MenuItem> customerOrder = List.of(
                new MainCourse("Spaghetti Carbonara", 12.99),
                new Drink("Coca Cola", 2.99),
                new Dessert("Chocolate Cake", 6.99)
        );

        System.out.println("\nCustomer Order:");
        customerOrder.forEach(System.out::println);


        double totalCost = customerOrder.stream()
                .mapToDouble(MenuItem::getPrice)
                .sum();
        System.out.println("Total Order Cost: $" + totalCost);
    }
}
