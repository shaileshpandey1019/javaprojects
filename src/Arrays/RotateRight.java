package Arrays;

import java.util.Arrays;

public class RotateRight {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5}; // 5,1,2,3,4
        int n=2;
        System.out.println(Arrays.toString(rotateRight( arr,  n)));
        }
    static int[] rotateRight(int arr[], int n) {
        int len = arr.length;
        int last = arr[len - 1];
        for (int i = len-1; i >0; i--) {
            arr[i] = arr[i-1]; //1,1,
        }
        arr[0]=last;
        return arr;
    }
}
