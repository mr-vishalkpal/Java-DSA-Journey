// Problem: Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order. Additionally, return the length of this distinct sorted subarray.
// Solution: Using Expected Approach
// Date 06-03-2026
// Author: Vishal Kumar


public class RemDupliSortedArr_ExpectedApp {
    
    static int removeDuplicates(int arr[]) {
        int n = arr.length;
        if(n <= 1)
            return n;

    // Start from the second element
    int idx = 1;

    for(int i = 1; i < n; i++){
        if(arr[i] != arr[i - 1]) {
            arr[idx++] = arr[i];
        }
    }
    return idx;

    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicates(arr);

     
        for(int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
