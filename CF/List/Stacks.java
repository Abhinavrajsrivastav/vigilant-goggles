import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Top element: " + stack.peek()); // 30
        
        System.out.println("Popped: " + stack.pop()); // 30
        
        System.out.println("Is empty? " + stack.isEmpty()); // false
        
        for (Integer item : stack) {
            System.out.println(item); // 10, 20
        }
        
        System.out.println("Position of 10: " + stack.search(10)); // 2
    }
}
