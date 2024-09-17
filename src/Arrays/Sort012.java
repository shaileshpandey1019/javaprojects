package Arrays;

import java.util.Arrays;  // Import Arrays to use Arrays.toString()

public class Sort012 {
    public static void main(String[] args){
        System.out.println("start");
        int[] arr = {0, 2, 1, 0, 0, 2, 2, 1, 1};
        Sort012.sort012(arr);
        System.out.println(Arrays.toString(arr));  // To display the sorted array
    }

    public static void sort012(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Count the number of 0s, 1s, and 2s
        for (int a : arr) {
            if (a == 0) {
                count0++;
            } else if (a == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        // Refill the array based on counts
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }
        for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
            arr[i] = 2;
        }
    }
}
