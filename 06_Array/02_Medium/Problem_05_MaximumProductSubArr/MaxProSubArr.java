// Problem: Given an array arr[] consisting of positive, negative, and zero values, find the maximum product that can be obtained from any contiguous subarray of arr[].
// Solution: Using two nested loops
// Date: 15-3-2026
// Author: Vishal kumar

public class MaxProSubArr {
    static int maxProduct(int arr[]){

        int n = arr.length;

        // Initialize result
        int maxProd = arr[0];

        for(int i = 0; i < n; i++){
            int mul = 1;

            // traverseing in current subarray
            for(int j = i; j < n; j++){
                mul *= arr[j];

                // updating result every time to keep track of the maximum prodcut
                maxProd = Math.max(maxProd, mul);
            }
        }
        return maxProd;
    }

    public static void main(String args[]){
        int arr[] = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));
    }
}
