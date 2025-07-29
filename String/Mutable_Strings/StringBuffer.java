package Mutable_Strings;

public class StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb.toString()); // Output: Hello World

        sb.insert(5, ",");
        System.out.println(sb.toString()); // Output: Hello, World

        sb.replace(0, 5, "Hi");
        System.out.println(sb.toString()); // Output: Hi, World

        sb.delete(2, 4);
        System.out.println(sb.toString()); // Output: Hi World
    }
}
