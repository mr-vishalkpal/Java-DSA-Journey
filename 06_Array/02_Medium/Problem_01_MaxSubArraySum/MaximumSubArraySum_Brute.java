// Problem: Maximum SubArray Sum 
// Solution: Using three nested loop

public class MaximumSubArraySum_Brute {

    static int MaximumSubArraySum(int arr[]){
        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int start = i;
            for(int j = i; j < n; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k <= end; k++){
                    currSum += arr[k];
                } 
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    
    public static void main(String args[]) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};

        System.out.println(MaximumSubArraySum(arr));
    }
}
