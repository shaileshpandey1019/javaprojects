package Arrays;

import java.util.HashMap;

public class HashMapExample1 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = HashMapExample1.majorityElement(nums);
        System.out.println("The majority element is: " + result);
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
        int count = nums.length / 2;
        for (int n : nums) {
            // If the map contains the key, increment the count; otherwise, add it with count 1
            if (h1.containsKey(n)) {
                h1.put(n, h1.get(n) + 1);
            } else {
                h1.put(n, 1);
            }

            // Check if the current number is the majority element
            if (h1.get(n) > count) {
                return n;
            }
        }
        // The problem guarantees that a majority element always exists,
        // so we don't need to handle the case where no majority element is found.
        return -1; // This line is just to satisfy the compiler.
    }
}
