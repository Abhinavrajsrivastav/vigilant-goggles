package List;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        
        list.add(1, "Grapes");
        System.out.println("Element at index 2: " + list.get(2)); // Orange
        
        list.set(2, "Mango");
        
        list.remove("Apple");
        list.remove(1);
        
        System.out.println("Contains Banana? " + list.contains("Banana")); // true
        
        System.out.println("Size: " + list.size()); // 2
        
        for (String fruit : list) {
            System.out.println(fruit);
        }
        
        list.clear();
        System.out.println("Is empty? " + list.isEmpty()); // true
    }
}


// ArrayLists are dynamic arrays.
// ArrayLists are resizable arrays.
//Size of ArrayList increases dynamically. like if we add more elements than the size of the array, 
//it creates a new array of size 2n and copies all the elements to the new array.