// Problem: Given an Array of integers arr[] of size n, the task is to rotate the array elements to the left by d positions.
// Solution: Naive Approach
// Date: 14-01-2026
// Author: Vishal Kuamr

import java.util.Arrays;

class RotateArray_Naive{
    static void rotateArr(int arr[], int d) {
        int n = arr.length;

        // Repeat the rotation d times
        for(int i = 0; i < d; i++){

            // Left rotate the array by one position
            int fisrt = arr[0];
            for(int j = 0; j < n - 1; j++){
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = fisrt;
        }
    }

    public static void main( String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6};
        int d = 2;

        rotateArr(arr, d);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}