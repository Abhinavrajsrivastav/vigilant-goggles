import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicates {
    public static void main(String[] args) {
        List<Integer> li = List.of(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        List<Integer> evenNumbers = li.stream()
        .filter(isEven)
        .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);
    }
}
