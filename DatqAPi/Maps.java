import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Maps {
public static void main(String[] args) {
//Maps in Streams...
//Map is a function that converts one value to another value.

     List<Integer> li  = Arrays.asList(1,2,3,4,5,6,7,8,9,10);    
     Stream<Integer> data = li.stream();

        //Using map to convert each element to its square
        Stream<Integer> square = data.map(n->n*n);
        square.forEach(n->System.out.println(n));
    }
}
