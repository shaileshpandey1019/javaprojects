public class ArrayBubbleShort {
    public static void main(String[] args){
        int[] arr={1,3,2,4,8,5};
        int size=arr.length;

        for (int i=0; i<size;i++){
            for (int j=1; j<size-1;j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    arr[i] = temp;
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            System.out.println(arr);

        }

    }
}
