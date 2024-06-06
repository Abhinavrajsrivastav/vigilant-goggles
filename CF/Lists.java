import java.util.Arrays;
import java.util.List;

//importing iterator interface
import java.util.Iterator;

//importing Collection class;
import java.util.Collection;

class Lists{
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        li.forEach(n->System.out.println(n*n));
    }
}