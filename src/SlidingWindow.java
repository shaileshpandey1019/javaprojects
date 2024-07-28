// Java code O(n*k) solution for finding maximum sum of
// a subarray of size k
//Time complexity: O(k*n) as it contains two nested loops.
//        Auxiliary Space: O(1)

public class SlidingWindow {
       static int maxSum(int arr[],int k, int n){
           //INITIALIZE Result
           int max_sum=0;
//           consider  all block starting with i
           for(int i=0;i<n-k+1;i++){
//               initialize current sum
               int current_sum=0;
               for(int j=0;j<k;j++){
                   current_sum = current_sum + arr[i + j];
//                   update result if required
                   max_sum = Math.max(current_sum, max_sum);
               }

           }
           return max_sum;
      }

       public static void main(String[] args){
           int arr[]={1,3,4};
           int k =2;
           int n=arr.length;
           System.out.println(maxSum(arr,k,n));
       }
}
