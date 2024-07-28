package Set;
import java.util.LinkedHashSet;

public class LHS {
    public static void main(String[] args) {
        //LinkedHashSet

        //Methods of LinkedHashSet

        //Creating a LinkedHashSet
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);

        //print the linkedhashset
        System.out.println(lhs);

        //remove an element from the linkedhashset
        lhs.remove(2);

        //check if the linkedhashset contains an element
        System.out.println(lhs.contains(1));

        //check if the linkedhashset is empty
        System.out.println(lhs.isEmpty());

        //print the size of the linkedhashset
        System.out.println(lhs.size());

        //clear the linkedhashset
        lhs.clear();
    }
    
}
