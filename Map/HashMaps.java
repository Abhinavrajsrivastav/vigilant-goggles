import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        // Step 1: Create and populate the map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // // Step 2: Access elements using the get method
        // int appleCount = map.get("Apple");
        // System.out.println("Apple count: " + appleCount);

        // // Step 3: Iterate over keys
        // for (String key : map.keySet()) {
        //     System.out.println("Key: " + key + ", Value: " + map.get(key));
        // }

        // // Step 4: Iterate over values
        // for (Integer value : map.values()) {
        //     System.out.println("Value: " + value);
        // }

        // // Step 5: Iterate over entries
        // for (Map.Entry<String, Integer> entry : map.entrySet()) {
        //     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        // }

        // Step 6: Iterate using forEach method
        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
    }
}
