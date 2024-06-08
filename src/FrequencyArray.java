public class FrequencyArray {

    public static void main(String[] args){
        int[] arr={1,2,3,2,3,4,2,6,74,5,4,6,6,6,6};

        for (int i=0; i<arr.length;i++){
            int count =1;
            for (int j=i+1; j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;

                }

            }

        }


    }
}
