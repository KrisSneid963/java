import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> intoString = x -> "Value: " + x;
        System.out.println(intoString.apply(5));
    }
}
