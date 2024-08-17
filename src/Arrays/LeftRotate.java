package Arrays;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5}; // 2,3,4,5,1
        int n=2;
        System.out.println(Arrays.toString(rotateLeft( arr,  n)));


    }

    static int[] rotateLeft(int arr[], int n){
        int first=arr[0];
        int len=arr.length;
        for (int i=0; i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[len-1]=first;
        return arr;
    }
}
