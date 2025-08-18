package DSA.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // 1. Create a Stack of Strings
        Stack<String> myStack = new Stack<>();

        // 2. Push elements onto the stack
        myStack.push("Apple");
        myStack.push("Banana");
        myStack.push("Cherry");
        System.out.println("Stack after pushing elements: " + myStack); // Output: [Apple, Banana, Cherry]

        // 3. Peek at the top element
        String topElement = myStack.peek();
        System.out.println("Top element (without removing): " + topElement); // Output: Cherry
        System.out.println("Stack after peeking: " + myStack); // Output: [Apple, Banana, Cherry]

        // 4. Pop elements from the stack
        String poppedElement1 = myStack.pop();
        System.out.println("Popped element: " + poppedElement1); // Output: Cherry
        System.out.println("Stack after popping: " + myStack); // Output: [Apple, Banana]

        String poppedElement2 = myStack.pop();
        System.out.println("Popped element: " + poppedElement2); // Output: Banana
        System.out.println("Stack after second pop: " + myStack); // Output: [Apple]

        // 5. Check if the stack is empty
        boolean isEmpty = myStack.empty();
        System.out.println("Is the stack empty? " + isEmpty); // Output: false

        // 6. Search for an element
        int position = myStack.search("Apple");
        System.out.println("Position of 'Apple' on the stack: " + position); // Output: 1 (1-based index)
    }
}
