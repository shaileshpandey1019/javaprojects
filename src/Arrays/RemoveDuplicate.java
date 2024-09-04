package Arrays;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args){
        int arr[]={1,2,3,2,3,4,3}; //1,2,3,4
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }
    static int[] removeDuplicate(int arr[]){
        ArrayList<Integer> uniqeList= new ArrayList<Integer>();
        int len=arr.length;
        int arr1[]= new int[len];
        for (int i = 0; i < len; i++){
            if (!uniqeList.contains(arr[i])){
                uniqeList.add(arr[i]);
            }
        }
        // Convert the ArrayList back to an array
        int[] result = new int[uniqeList.size()];
        for (int i = 0; i < uniqeList.size(); i++) {
            result[i] = uniqeList.get(i);
        }

        return result;
    }


}




















