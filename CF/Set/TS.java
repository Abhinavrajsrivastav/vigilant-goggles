package Set;
import java.util.TreeSet;

public class TS {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);

        System.out.println(ts);

        ts.remove(2);

        System.out.println(ts.contains(1));

        System.out.println(ts.isEmpty());

        System.out.println(ts.size());

        ts.clear();
    }
}
