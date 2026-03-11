// Problem: You have an inclusive interval [lower, upper] and a sorted array of unique integers arr[], all of which lie within this interval. A number x is considered missing if x is in the range [lower, upper] but not present in arr. Your task is to return the smallest set of sorted ranges that includes all missing numbers, ensuring no element from arr is within any range, and every missing number is covered exactly once.
// Solution: Using Linear Scan
// Date: 11-03-2026
// Author: Vishal kumar

import java.util.*;

public class Missing_Rnages_Numbers_UsingLinearScan {

    public static List<List<Integer>> missingRanges(int arr[], int lower, int upper) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();

        // Check for missing range before the first element 
        if(lower < arr[0]) {
            res.add(Arrays.asList(lower, arr[0] - 1));
        }

        // Check for missing ranges between consecutives elemnts 
        for(int i = 0; i < n - 1; i++) {
            if(arr[i + 1] - arr[i] > 1){
                res.add(Arrays.asList(arr[i] + 1, arr[i + 1]- 1));
            }
        }

        // Check for missing range after the last element
        if(upper > arr[n - 1]){
            res.add(Arrays.asList(arr[n - 1] + 1, upper));
        }

        return res;
    }

    public static void main(String args[]) {
        int lower = 10;
        int upper = 50;
        int arr[] = {14, 15, 20, 30, 31, 45};
        List<List<Integer>> res = missingRanges(arr, lower, upper);
        for(List<Integer> range : res) {
            System.out.println(range.get(0) + " " + range.get(1));
        }

    }
}
