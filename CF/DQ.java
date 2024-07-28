import java.util.ArrayDeque;
import java.util.Deque;

public class DQ {
    public static void main(String[] args) {
        //Deque

        //Methods of Deque

        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);

        //print the first element of the deque
        System.out.println(dq.getFirst());

        //print the last element of the deque
        System.out.println(dq.getLast());

        //remove the first element of the deque
        System.out.println(dq.removeFirst());

        //remove the last element of the deque
        System.out.println(dq.removeLast());

        //add the first element of the deque
        dq.addFirst(10);

        //add the last element of the deque
        dq.addLast(20);
    }
}
