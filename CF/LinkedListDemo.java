import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        // Print the linked list
        System.out.println(linkedList);

        // Get the first element of the linked list
        System.out.println(linkedList.getFirst());

        // Get the last element of the linked list
        System.out.println(linkedList.getLast());

        // Get the element at index 1
        System.out.println(linkedList.get(1));

        // Remove the first element of the linked list
        linkedList.removeFirst();

        // Remove the last element of the linked list
        linkedList.removeLast();

        // Print the linked list
        System.out.println(linkedList);

        // Check if the linked list contains an element
        System.out.println(linkedList.contains(2));

        // Get the size of the linked list
        System.out.println(linkedList.size());

        // Clear the linked list
        linkedList.clear();

        // Print the linked list
        System.out.println(linkedList);
    }
}
