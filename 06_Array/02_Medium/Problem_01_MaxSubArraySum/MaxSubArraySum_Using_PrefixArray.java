// Problem: Maximum SubArray sum 
// Solution: Using PrefixArray 

public class MaxSubArraySum_Using_PrefixArray {

    static int MaxSubArraySum(int arr[]){
        int n = arr.length;

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[n];

        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i < n; i++){
            int start = i;
            for(int j = i; j < n; j++){
                int end = j;
               currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            }
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(MaxSubArraySum(arr));
    }
}
