// Problem: Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing, and another number occurs twice in the array, find both the duplicate number and the missing number.
// Solution: Using Visited Array
// Date: 09-03-2026

import java.util.ArrayList;

class MissingAndRepeatingArr_UsingVisitedArr{
    static ArrayList<Integer> findTwoElement(int[] arr) {
        int n = arr.length;

        // frequency array to count occurrences
        int[] freq = new int[n + 1]; 
        int repeating = -1;
        int missing = -1;

        // count frequency of each element
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // identify missing and repeating numbers
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) missing = i;
            else if (freq[i] == 2) repeating = i;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        ArrayList<Integer> ans = findTwoElement(arr);

        System.out.println(ans.get(0) + " " + ans.get(1));
    }
}