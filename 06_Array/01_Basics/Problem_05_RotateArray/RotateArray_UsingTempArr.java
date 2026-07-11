/* Problem: Given an Array of integers arr[] of size n, the task is to rotate the array elements to the left by d positions.*/ 
// Solution: Better Approach Using Temporary Array
// Date: 27-02-2026
// Author: Vishal Kumar

import java.util.Arrays;

public class RotateArray_UsingTempArr {

    static void rotateArr(int arr[], int d){

        int n = arr.length;

        // Handle case when d > n
        d %= n;

        // Storing rotated version of array
        int temp[] = new int[n];

        // Copy last n - d elements to the front of temp
        for(int i = 0; i < n-d; i++){
            temp[i] = arr[d + i];
        }

        // Copy the first d elements to the back of temp
        for(int i = 0; i < d; i++){
            temp[n - d + i] = arr[i];
        }

        // Copying the elements of temp in arr
        // to get the final rotated array
        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
    }
    public static void main( String args[]){
        int arr[]
         = {1, 2, 3, 4, 5, 6};
        int d = 7;
        rotateArr(arr, d);
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
