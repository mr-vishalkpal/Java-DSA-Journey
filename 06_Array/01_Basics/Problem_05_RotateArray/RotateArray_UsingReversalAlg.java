// Problem: Given an Array of integers arr[] of size n, the task is to rotate the array elements to the left by d positions.
// Solution: Expected Approach Using Reversal Algorithm
// Date: 27-02-2026
// Author: Vishal Kumar


import java.util.Arrays;

public class RotateArray_UsingReversalAlg {

    // Function to rotate an array by d elements to the left
    static void rotateArr(int arr[], int d){
        int n = arr.length;

        d %= n;

        // Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Reverse the remaining n-d elements
        reverse(arr, d, n - 1 );

        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }
    
    // Function to reverse a portion of the array
    static void reverse(int arr[], int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6};
        int d = 2;

        rotateArr(arr, d);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
