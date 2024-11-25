package Queue;
import java.util.ArrayDeque;

public class ADQ {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.add(1);
        adq.add(2);
        adq.add(3);

        System.out.println(adq.getFirst());

        System.out.println(adq.getLast());

        System.out.println(adq.removeFirst());

        System.out.println(adq.removeLast());

        adq.addFirst(10);

        adq.addLast(20);
    }
}

// ArrayDeque - ArrayDeque is a special kind of deque that can be resized dynamically.
//An ArrayDeque insert and remove elements from both the ends.
//ArrayDeque is faster than LinkedList and Stack.
//null elements are not allowed in the ArrayDeque.
