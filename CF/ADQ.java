import java.util.ArrayDeque;

public class ADQ {
    public static void main(String[] args) {
        //ArrayDeque

        //Methods of ArrayDeque

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.add(1);
        adq.add(2);
        adq.add(3);

        //print the first element of the array deque
        System.out.println(adq.getFirst());

        //print the last element of the array deque
        System.out.println(adq.getLast());

        //remove the first element of the array deque
        System.out.println(adq.removeFirst());

        //remove the last element of the array deque
        System.out.println(adq.removeLast());

        //add the first element of the array deque
        adq.addFirst(10);

        //add the last element of the array deque
        adq.addLast(20);
    }
}
