import java.util.HashMap;
import java.util.Map;


public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Access a value by its key
        int value = map.get("one");
        System.out.println("Value for key 'one': " + value);

        // Check if a key exists
        boolean hasKey = map.containsKey("two");
        System.out.println("Contains key 'two': " + hasKey);

        // Check if a value exists
        boolean hasValue = map.containsValue(3);
        System.out.println("Contains value 3: " + hasValue);

        // Remove a key-value pair
        map.remove("two");
        System.out.println("Key 'two' removed.");

        // Iterate over the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
