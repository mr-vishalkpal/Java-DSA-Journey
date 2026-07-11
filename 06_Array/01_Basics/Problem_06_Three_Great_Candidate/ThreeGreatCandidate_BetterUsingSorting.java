// Given an integer array, find a maximum product of triplet in the array
// Solution: Btter Approach Using Sorting
// Date: 28-02-2026
// Author: Vishal Kumar

import java.util.Arrays;

public class ThreeGreatCandidate_BetterUsingSorting {
    static int maxProduct(int arr[]){
        int n = arr.length;

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the maximum of product of last three elements and products of first two elements and last element

        return Math.max(arr[0] * arr[1] * arr[n - 1], arr[n - 1] * arr[n - 2]* arr[n - 3]);
    }

    public static void main(String args[]){
        int arr[] = {-10, -3, 5, 6, -20};
        int max = maxProduct(arr);
        System.out.println(max);
    }
}
