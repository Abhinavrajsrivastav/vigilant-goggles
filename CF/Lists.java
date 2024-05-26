import java.util.Arrays;
import java.util.List;

class Lists{
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        li.forEach(n->System.out.println(n*n));
    }
}