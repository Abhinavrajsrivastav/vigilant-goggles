package DSA.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeExample {
    public static void main(String[] args) {
        // 1. Create a Deque using LinkedList
        Deque<String> myDeque = new LinkedList<>();

        // 2. Use the Deque as a Queue (FIFO)
        System.out.println("--- Using as a Queue (FIFO) ---");
        myDeque.addLast("Task 1"); // Adds to the end of the queue
        myDeque.addLast("Task 2");
        myDeque.addLast("Task 3");
        System.out.println("Queue: " + myDeque); // Output: [Task 1, Task 2, Task 3]

        String completedTask = myDeque.removeFirst(); // Removes from the front
        System.out.println("Completed task: " + completedTask); // Output: Task 1
        System.out.println("Queue after removal: " + myDeque); // Output: [Task 2, Task 3]
        System.out.println("------------------------------\n");

        // 3. Use the Deque as a Stack (LIFO)
        System.out.println("--- Using as a Stack (LIFO) ---");
        myDeque.addFirst("Page 1"); // Pushes to the top (front) of the stack
        myDeque.addFirst("Page 2");
        myDeque.addFirst("Page 3");
        System.out.println("Stack: " + myDeque); // Output: [Page 3, Page 2, Page 1, Task 2, Task 3]

        String topPage = myDeque.removeFirst(); // Pops from the top (front)
        System.out.println("Popped page: " + topPage); // Output: Page 3
        System.out.println("Stack after pop: " + myDeque); // Output: [Page 2, Page 1, Task 2, Task 3]
    }
}