package Strings;

public class string_buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        // StringBuffer is mutable, so it will create a new object in heap memory...
        System.out.println(sb.hashCode());
        sb.append("World");
        // After appending, it will print same hashcode, because it's still in heap memory...
        System.out.println(sb.hashCode());
    }
}
