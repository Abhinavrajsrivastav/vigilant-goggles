package Generics;

// Generic class example
class Box<T> {
    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
}

public class Generics
 {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(100);
        System.out.println("Integer Box content: " + integerBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println("String Box content: " + stringBox.get());
    }
}

