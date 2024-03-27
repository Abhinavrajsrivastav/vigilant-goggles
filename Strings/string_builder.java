package Strings;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        // StringBuilder is mutable, so it will create a new object in heap memory...
        System.out.println(sb.hashCode());
        sb.append("World");
        // After appending, it will print same hashcode, because it's still in heap memory...
        System.out.println(sb.hashCode());

        //different between stringBuilder and StringBuffer class

        //1. StringBuilder is not synchronized, so it's faster than StringBuffer.
        //2. StringBuilder is not thread safe, so it's not recommended in multi-threading environment.
        //3. StringBuilder is introduced in JDK 1.5, StringBuffer is introduced in JDK 1.0.
        //4. StringBuilder is mutable, so it's not safe to use in multi-threading environment.
        //5. StringBuilder is not safe to use in multi-threading environment.
    }
}
