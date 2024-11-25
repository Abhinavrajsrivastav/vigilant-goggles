import java.util.*;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");

        System.out.println("Value for key 2: " + table.get(2)); // Banana

        System.out.println("Contains key 1? " + table.containsKey(1)); // true
        System.out.println("Contains value 'Cherry'? " + table.containsValue("Cherry")); // true

        table.remove(2);

        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
