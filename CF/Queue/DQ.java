package Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class DQ {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);

        System.out.println(dq.getFirst());

        System.out.println(dq.getLast());

        System.out.println(dq.removeFirst());

        System.out.println(dq.removeLast());

        dq.addFirst(10);

        dq.addLast(20);
    }
}

// ArrayDeque - ArrayDeque is a special kind of deque that can be resized dynamically.
// it is a double-ended queue that supports element insertion and removal at both ends.
