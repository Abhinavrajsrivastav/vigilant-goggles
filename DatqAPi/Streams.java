import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        //filter
        // List<String> filteredWords = words.stream()
        // .filter(word -> word.length() > 5) 
        // .collect(Collectors.toList());
        // System.out.println("Filtered Words: " + filteredWords);

        //map
        // List<String> upperCaseWords = words.stream()
        // .map(String::toUpperCase) 
        // .collect(Collectors.toList());
        // System.out.println("Uppercase Words: " + upperCaseWords); 

        //collect
        // List<String> collectedWords = words.stream()
        // .collect(Collectors.toList());
        // System.out.println("Collected Words: " + collectedWords);

        //reduce - concatenates all the words with a comma and space
        Optional<String> reducedString = words.stream()
        .reduce((a, b) -> a + ", " + b);
        reducedString.ifPresent(System.out::println); 

        //forEach
        // System.out.print("Words: ");
        // words.stream().forEach(word -> System.out.print(word + " "));
    }
}
