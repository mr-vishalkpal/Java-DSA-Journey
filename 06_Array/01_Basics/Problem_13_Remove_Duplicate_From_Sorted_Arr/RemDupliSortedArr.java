// Problem: Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order. Additionally, return the length of this distinct sorted subarray.
// Solution: Using Hash Set Works for Unsorted Also
// Date 06-03-2026
// Author: Vishal Kumar

import java.util.HashSet;

public class RemDupliSortedArr {
    
    static int removeDuplicates(int arr[]) {

        // To track seen elements
        HashSet<Integer> s = new HashSet<>();

        // To maintain the new size of the array
        int idx = 0;

        for(int i = 0; i < arr.length; i++) {
            if(!s.contains(arr[i])) {
                s.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }

        // Return the size of the array with unique elements
        return idx;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicates(arr);

        for(int i = 0; i < newSize; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
