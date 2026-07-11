// Problem: Given a sorted array arr[] of integers (in ascending order), rearrange the elements in-place to form a wave-like array.
// Solution: Using Adjacent Pair Swapping Method
// Date: 03-03-2026
// Author: Vishal Kumar

import java.util.Arrays;

public class SortAnArrInWaveFrom_Using_AdjacentPairSwaping {
    
    void sortInWave(int arr[]) {
        int n = arr.length;
        // swap adjacent elements
        for(int i= 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String args[]) {
        SortAnArrInWaveFrom_Using_AdjacentPairSwaping ob = new SortAnArrInWaveFrom_Using_AdjacentPairSwaping();
        int arr[] = {1, 2, 3, 4, 5};
        ob.sortInWave(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
