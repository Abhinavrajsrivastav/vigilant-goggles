import java.util.*;

public class Vectors {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        
        vector.add(1, "Grapes");
        
        System.out.println("Element at index 2: " + vector.get(2)); // Cherry
        
        vector.set(2, "Mango");
        
        vector.remove("Banana");
        
        System.out.println("Size: " + vector.size()); // 3
        System.out.println("Capacity: " + vector.capacity()); // Default is 10
        
        for (String fruit : vector) {
            System.out.println(fruit);
        }
        
        System.out.println("Contains 'Apple'? " + vector.contains("Apple")); // true
    }
}
