import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveLetter {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
        words.removeIf(word -> word.contains("e"));
        System.out.println(words);


        //if we want to find letter "a"
//        List<String> words1 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
//        List<String> filteredWords = words1.stream()
//                .filter(word -> word.contains("a"))
//                .collect(Collectors.toList());
//        System.out.println("Words with 'a: " + filteredWords);

    }
}
