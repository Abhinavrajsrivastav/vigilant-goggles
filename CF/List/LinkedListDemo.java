package List;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());

        System.out.println(linkedList.getLast());

        System.out.println(linkedList.get(1));

        linkedList.removeFirst();

        linkedList.removeLast();

        System.out.println(linkedList);

        System.out.println(linkedList.contains(2));

        System.out.println(linkedList.size());

        linkedList.clear();

        System.out.println(linkedList);
    }
}


// LinkedLists are doubly linked lists.
// LinkedLists are ordered lists.
// LinkedLists are dynamic like when we add elements to the list, it creates a node and adds the element to the node.
// LinkedLists are not synchronized.