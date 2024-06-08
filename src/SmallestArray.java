public class SmallestArray {
    public static void main(String[] args){
        int[] arr={14,23,333,455,22,5};
        int min=arr[0];
        for(int i=0; i<arr.length;i++){
           if( arr[i]<min){
               min = arr[i];

           }

        }
        System.out.println("Smallest element in array is : " + min);

    }
}
