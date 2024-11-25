package Set;
import java.util.LinkedHashSet;

public class LHS {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);

        System.out.println(lhs);

        lhs.remove(2);

        System.out.println(lhs.contains(1));

        System.out.println(lhs.isEmpty());

        System.out.println(lhs.size());

        lhs.clear();
    }
    
}
