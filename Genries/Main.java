// A generic class with a type parameter T
class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Box object for Integer type
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println("Integer Box contains: " + integerBox.getContent());

        // Creating a Box object for String type
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics");
        System.out.println("String Box contains: " + stringBox.getContent());
    }
}
