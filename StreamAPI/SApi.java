package StreamAPI;
import java.util.Arrays;
import java.util.stream.*;

public class SApi {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5);

        
        // ArrayList<Integer> li = Arrays.asList(1,2,3,4);
        // Stream<Integer> s2 = li.stream();

        // Stream<Integer> s3 = Stream.of(1,2,3,4,5);
        
        //Stream Methods...

        // 1. filter() - to filter the elements based on some condition
        // Stream<Integer> s2 = s1.filter(n->n%2==0);
        
        // 2. map() - to perform some operation on each element
        // Stream<Integer> s3 = s1.map(n->n*n);
        
        // 3. forEach() - to print the elements
        // s1.forEach(n->System.out.println(n));

        // 4. reduce() - to perform some operation on all elements
        // int sum = s1.reduce(0, (a,b)->a+b);
        // System.out.println(sum);

        // 5. count() - to count the number of elements
        // long count = s1.count();
        // System.out.println(count);

        // 6. sorted() - to sort the elements
        // Stream<Integer> s2 = s1.sorted();
        // s2.forEach(n->System.out.println(n));

        // 7. distinct() - to remove duplicates
        // Stream<Integer> s2 = s1.distinct();

        // 8. limit() - to limit the number of elements
        // Stream<Integer> s2 = s1.limit(3);

        // 9. skip() - to skip the number of elements
        // Stream<Integer> s2 = s1.skip(3);

        // 10. anyMatch() - to check if any element satisfies the condition 
        // boolean b = s1.anyMatch(n->n%2==0);

        // 11. allMatch() - to check if all elements satisfy the condition
        // boolean b = s1.allMatch(n->n%2==0);

        // 12. noneMatch() - to check if no element satisfies the condition
        // boolean b = s1.noneMatch(n->n%2==0);

        // 13. findFirst() - to find the first element
        // Optional<Integer> o = s1.findFirst();

        // 14. findAny() - to find any element
        // Optional<Integer> o = s1.findAny();

        // 15. toArray() - to convert stream to array
        // Object[] arr = s1.toArray();

        // 16. collect() - to collect the elements
        // List<Integer> li = s1.collect(Collectors.toList());

        // 17. min() - to find the minimum element
        // Optional<Integer> o = s1.min((a,b)->a-b);

        // 18. max() - to find the maximum element
        // Optional<Integer> o = s1.max((a,b)->a-b);

        // 19. sum() - to find the sum of elements
        // int sum = s1.mapToInt(n->n).sum();

        // 20. average() - to find the average of elements
        // double avg = s1.mapToInt(n->n).average().getAsDouble();

        // 21. range() - to generate a range of elements
        // IntStream s2 = IntStream.range(1, 6);

        // 22. rangeClosed() - to generate a range of elements including the end value
        // IntStream s2 = IntStream.rangeClosed(1, 5);

        // 23. iterate() - to generate infinite elements
        // Stream<Integer> s2 = Stream.iterate(1, n->n+1);

        // 24. generate() - to generate infinite elements
        // Stream<Integer> s2 = Stream.generate(()->1);

        // 25. concat() - to concatenate two streams
        // Stream<Integer> s2 = Stream.concat(s1, s3);

        // 26. peek() - to perform some operation on each element

        // 27. flatMap() - to convert stream of streams to stream
        // Stream<Integer> s2 = s1.flatMap(n->Stream.of(n,n+1));

        // 28. distinct() - to remove duplicates
    }
}
