// Problem: Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing, and another number occurs twice in the array, find both the duplicate number and the missing number.
// Solution: Using Array Making
// Date: 09-03-2026

import java.util.ArrayList;

public class MissingAndRepeatingArr_UsingArrMaking {
    static ArrayList<Integer> findTwoElement(int[] arr) {
        int n = arr.length;
        int repeating = -1;

        // traverse the array and mark visited indices
        // by negating the value at index arr[i] - 1
        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);

            // if the value at index val - 1 is already negative
            // it means we've seen this value before
            if (arr[val - 1] > 0) {
                arr[val - 1] = -arr[val - 1]; 
            } else {
                // if it's already negative, this value is 
                // the repeating one
                repeating = val;
            }
        }

        int missing = -1;

        // after marking, the index with a positive value
        // corresponds to the missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        // return result: first repeating, then missing
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
