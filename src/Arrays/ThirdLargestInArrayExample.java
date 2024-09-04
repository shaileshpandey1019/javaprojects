package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ThirdLargestInArrayExample {
    public static void main(String args[]) {
        int arr[] = {1, 2,89,88,87,0,8,0,-9,-7,-79, 5, 6, 3, 2};
        int k=3;
        System.out.println("Third Largest: " + getThirdLargest(arr,k));
    }

     static  int getThirdLargest(int[] arr,int k) {
        Arrays.sort(arr);
        System.out.println(arr);
        int len= arr.length;
        int third= arr[len-k];
        System.out.println(third);
        return third;

    }


}
