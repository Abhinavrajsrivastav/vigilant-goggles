import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //enter elements into stack
        stack.push(1);
        stack.push(2);

        //print the top element of the stack
        System.out.println(stack.peek());

        //pop the top element of the stack
        System.out.println(stack.pop());

        //check if the stack is empty
        System.out.println(stack.empty());

        //search for an element in the stack
        System.out.println(stack.search(1));

        //create a stack from a list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Stack<Integer> stack2 = new Stack<>();
        stack2.addAll(list);

    }
}
