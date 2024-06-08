public class MultiDimensionalArray {

    public static void main(String[] args){

        int[][] arr1={{1,2,0},{3,4},{6,9}};
        for (int i =0;i<arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){

                System.out.print(arr1[i][j] + " ");
            }
//            System.out.println();
        }
    }
}
