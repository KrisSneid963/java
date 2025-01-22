import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapitalLettersReplaceAll {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        names.replaceAll(String::toUpperCase);
        //or names.replaceAll(name -> name.toUpperCase());
        System.out.println(names);
    }
}
