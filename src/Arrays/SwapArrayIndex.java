package Arrays;

import java.util.Arrays;

public class SwapArrayIndex {
    public static void main(String[] args){
        int[] arr={1,3,4,5};
        int[] arr1={2,5,4,3};
        int x=arr.length;
        int[] arr2= new int[x];

        for (int i=0;i<x;i++) {
            arr2[i]=arr[i];
            arr[i]=arr1[i];
            arr1[i]=arr2[i];
        }
        System.out.println("array arr after swapping "+ Arrays.toString(arr));
        System.out.println("array1 arr after swapping "+Arrays.toString(arr1));


    }
}
