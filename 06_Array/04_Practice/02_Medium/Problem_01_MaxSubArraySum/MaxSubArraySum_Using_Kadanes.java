// Problem: Max Sub Array of Sum
// Solution: Using kadane's Algorithm

public class MaxSubArraySum_Using_Kadanes {

    static int MaxSubArraySum(int arr[]){
        int n = arr.length;
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < n; i++){
            cs += arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs , ms);
        }
        return ms;
    }
    public static void main(String args[]){
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(MaxSubArraySum(arr));
    }
}
