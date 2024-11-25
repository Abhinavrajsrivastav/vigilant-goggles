package Set;
import java.util.*;

class HS{
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);

        System.out.println(hs);

        hs.remove(2);

        System.out.println(hs.contains(1));

        System.out.println(hs.isEmpty());

        System.out.println(hs.size());

        hs.clear();
    }
}