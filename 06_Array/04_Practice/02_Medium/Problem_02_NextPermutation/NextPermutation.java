// Problem: Given an array of integers arr[] representing a permutation (i.e., all elements are unique and arranged in some order), find the next lexicographically greater permutation by rearranging the elements of the array.
// Solution: Generate all Permutation
// Date: 12-03-2026
// Author: Vishal Kumar 

import java.util.*;

public class NextPermutation{

    public static void nextPermutation(int arr[]) {

        int n = arr.length;
        int i = n - 2;

        // Step 1: find first decreasing element from right
        while(i >= 0 && arr[i] >= arr[i + 1]){
            i--;
        }

        // Step 2: if such element exists
        if(i >= 0) {
            int j = n - 1;

            // find element just greater than arr[i]
            while(arr[j] <= arr[i]) {
                j--;
            }

            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // step 3: reverse the remaining array
        reverse(arr, i + 1, n- 1);
    }

    public static void reverse(int arr[], int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[] ) {
        int arr[] = {1,2,3};
        nextPermutation(arr);

        System.out.println(Arrays.toString(arr));
    }
}