public class SlidingWindowON {

    public static void main(String[] args){
        int[] arr={1,2,3,4,3,4,66,33,33,22,32};
        int k=3;
        int n=arr.length;
    }

    static int maxSum(int[] arr,int k, int n){
        int max_Sum=0;
        if (n<k){
            System.out.println("Invalid");
        return -1;
        }
        for (int i=0; i<n;i++)
            max_Sum += arr[i];
        int window_sum=max_Sum;
        for(int i=k;i<n;i++){
            window_sum +=arr[i]-arr[i-k];
            max_Sum=Math.max(max_Sum,window_sum);
        }

        return max_Sum;
    }
}
