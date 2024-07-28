package Arrays;

public class SumArray {
    public static void main (String[] args){
        int[] arr={45,2,3,4};
        int[] arr1={3,4,5,3};
        int x= arr.length;
        int[] arr2= new int[x];

        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i]+arr1[i];
            System.out.println(arr2[i]);
        }

    }
}
