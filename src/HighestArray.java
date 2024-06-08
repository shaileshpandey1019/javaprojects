public class HighestArray {
    public static void main(String[] args){
        int[] arr={2,3,3,66,43,-1};
        int max=arr[0];
        int min =arr[1];
        for (int i=0; i<arr.length;i++){

            if (arr[i]>max){
                max =arr[i];
            }

            else if (arr[i]<min) {
                min =arr[i];
            }

        }
        System.out.println("Highest element in array : " + max);
        System.out.println("Smallest element in array : " + min);

    }
}
