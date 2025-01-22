import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLastCharacter {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Eve", "Bob", "Alice", "Charlie"));
        names.sort(Comparator.comparingInt(name -> name.charAt(name.length() - 1)));

        System.out.println(names);
    }
}
//   List<String> names = new ArrayList<>(Arrays.asList("Eve", "Bob", "Alice", "Charlie"));
//        names.sort((name1, name2) -> Character.compare(
//                name1.charAt(name1.length() - 1),
//                name2.charAt(name2.length() - 1)
//        )); after suggesting Comparator