package FunctionalInterface;

public class FunctIn {
    public static void main(String[] args) {
        // Using lambda expression
        FunI fi = (int x) -> System.out.println(x * x); 
        fi.myMethod(10);

        // Calling the default method
        fi.myDefaultMethod();
    }
}

@FunctionalInterface
interface FunI {
    // Abstract method
    void myMethod(int x);

    // Concrete method (default method)
    default void myDefaultMethod() {
        System.out.println("Default Method");
    }
}
