import java.util.Arrays;

public class ShortArray {
    public static void main(String[] args){
        int[] arr ={1,2,24,3,-5};
        int a=arr[0];
        Arrays.sort(arr);
        System.out.println(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }



    }
}
