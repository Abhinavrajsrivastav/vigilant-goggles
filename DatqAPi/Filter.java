import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
     public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter out even numbers
        numbers.stream().filter(number -> number % 2 == 0).sorted()
                .forEach(n->System.out.println(n));
    }
}

//Filter - 
//Filter is an intermediate operation that reads the 
// elements from a stream and returns a new stream after removing
// all the elements which do not satisfy the given predicate.
