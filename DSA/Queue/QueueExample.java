package DSA.Queue;
import java.util.Queue;
import java.util.ArrayDeque;

public class QueueExample {
    public static void main(String[] args) {
        // 1. Create a Queue of Strings using ArrayDeque
        Queue<String> myQueue = new ArrayDeque<>();

        // 2. Add elements to the queue using offer()
        myQueue.offer("Apple");
        myQueue.offer("Banana");
        myQueue.offer("Cherry");
        System.out.println("Queue after offering elements: " + myQueue); // Output: [Apple, Banana, Cherry]

        // 3. Peek at the head element
        String headElement = myQueue.peek();
        System.out.println("Head element (without removing): " + headElement); // Output: Apple
        System.out.println("Queue after peeking: " + myQueue); // Output: [Apple, Banana, Cherry]

        // 4. Poll elements from the queue
        String polledElement1 = myQueue.poll();
        System.out.println("Polled element: " + polledElement1); // Output: Apple
        System.out.println("Queue after polling: " + myQueue); // Output: [Banana, Cherry]

        String polledElement2 = myQueue.poll();
        System.out.println("Polled element: " + polledElement2); // Output: Banana
        System.out.println("Queue after second poll: " + myQueue); // Output: [Cherry]

        // 5. Check if the queue is empty
        boolean isEmpty = myQueue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty); // Output: false

        // 6. Add another element to the end
        myQueue.offer("Date");
        System.out.println("Queue after adding 'Date': " + myQueue); // Output: [Cherry, Date]
    }
}