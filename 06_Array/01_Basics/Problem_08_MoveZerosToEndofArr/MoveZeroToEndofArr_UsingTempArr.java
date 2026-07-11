// Problem: Given an array of integers arr[], move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.
// Solution: Naive Approach Using Temporary Array
// Date: 02-03-2026
// Author: Vishal kumar

import java.util.Arrays;

public class MoveZeroToEndofArr_UsingTempArr{
    
    static void pushZerosToEnd(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];

        // to keep track of the index in temp[]
        int j = 0;

        // Copy non-zero elements to temp
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0)
                temp[j++] = arr[i];
        }

        // Fill remaining positions in temp[] with zeros
        while(j < n)
            temp[j++] = 0;

        // Copy all the elemets from temp[]  to arr[]
        for(int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String args[]){
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}