// Problem: Given an array of integers arr[], move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.
// Solution: Better Approach Using One Traversal
// Date: 02-03-2026
// Author: Vishal kumar


import java.util.Arrays;

public class MoveZeroToEndofArr_UsingOneTraversal {
    static void pushZerosToEnd(int arr[]){

        // Pointer to track the position for next non-zero elemwnt
        int count = 0;

        for(int i = 0; i < arr.length; i++){

            // If the current element is non-zero
            if(arr[i] != 0){

                // Swap the current element with the 0 at index 'count'

                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                // Move count pointer to the next position
                count++;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
