package Set;
import java.util.*;

class HS{
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);

        //print the hashset
        System.out.println(hs);

        //remove an element from the hashset
        hs.remove(2);

        //check if the hashset contains an element
        System.out.println(hs.contains(1));

        //check if the hashset is empty
        System.out.println(hs.isEmpty());

        //print the size of the hashset
        System.out.println(hs.size());

        //clear the hashset
        hs.clear();
    }
}