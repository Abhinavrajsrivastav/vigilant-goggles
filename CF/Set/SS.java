package Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SS {
    public static void main(String[] args) {
        //Sorted set - full code 
        
        //sorted set

        //Methods of SortedSet

        //Creating a SortedSet
        SortedSet<Integer> ss = new TreeSet<>();
        ss.add(1);
        ss.add(2);
        ss.add(3);

        //print the sorted set
        System.out.println(ss);

        //remove an element from the sorted set
        ss.remove(2);

        //check if the sorted set contains an element
        System.out.println(ss.contains(1));

        //check if the sorted set is empty
        System.out.println(ss.isEmpty());

        //print the size of the sorted set
        System.out.println(ss.size());

        //clear the sorted set
        ss.clear();
    }
}
