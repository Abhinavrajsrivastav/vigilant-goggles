package Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SS {
    public static void main(String[] args) {
        SortedSet<Integer> ss = new TreeSet<>();
        ss.add(1);
        ss.add(2);
        ss.add(3);

        System.out.println(ss);

        ss.remove(2);

        System.out.println(ss.contains(1));

        System.out.println(ss.isEmpty());

        System.out.println(ss.size());

        ss.clear();
    }
}
