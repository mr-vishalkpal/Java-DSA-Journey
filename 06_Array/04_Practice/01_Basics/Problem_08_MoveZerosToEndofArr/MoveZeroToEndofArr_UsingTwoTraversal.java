// Problem: Given an array of integers arr[], move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.
// Solution: Better Approach Two Traversal
// Date: 02-03-2026
// Author: Vishal kumar

import java.util.Arrays;

public class MoveZeroToEndofArr_UsingTwoTraversal {
    
    static void pushZerosToEnd(int arr[]){
        int count = 0;

        // If the element is non-zero, replace the element at index 'count' with  this element and encrement count

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0)
                arr[count++] = arr[i];
        }

        // Now all non-zero elements have been shifted to the front. make all elements 0 from count to end

        while(count < arr.length)
            arr[count++] = 0;
    }

    public static void main(String args[]){

        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};

        pushZerosToEnd(arr);
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
