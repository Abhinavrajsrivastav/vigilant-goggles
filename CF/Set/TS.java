package Set;
import java.util.TreeSet;

public class TS {
    public static void main(String[] args) {
        //TreeSet

        //Methods of TreeSet

        //Creating a TreeSet
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);

        //print the treeset
        System.out.println(ts);

        //remove an element from the treeset
        ts.remove(2);

        //check if the treeset contains an element
        System.out.println(ts.contains(1));

        //check if the treeset is empty
        System.out.println(ts.isEmpty());

        //print the size of the treeset
        System.out.println(ts.size());

        //clear the treeset
        ts.clear();
    }
}
