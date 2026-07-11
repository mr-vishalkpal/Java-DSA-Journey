// Problem: Given a non-negative number represented as an array of digits. The task is to add 1 to the number (increment the number represented by the digits by 1). The digits are stored such that the most significant digit is the first element of the array.
// Solution: Using 2nd Approach
// Date: 03-03-2026
// Author: Vishal Kumar

import java.util.*;

public class AddOneToNumRepreAsArrofDigi_Approach2 {
    
    // function to add one
    static int[] addOne(int arr[]){

        // initialize an index to end of array
        int index = arr.length - 1;

        // while the index is valid and the value at index is 9
        while(index >= 0 && arr[index] == 9)
            arr[index--] = 0;

        // if index < 0 (if all arr were 9)
        if(index < 0){

            //insert an one at the beggining of the array
            int [] newArr = new int[arr.length + 1];
            newArr[0] = 1;
            System.arraycopy(arr, 0, newArr, 1, arr.length);
            return newArr;
        }

        // else increament the value at [index]
        else 
            arr[index]++;
        return arr;
    }

    public static void main(String args[]){
        int arr[] = {9, 9, 9};
        int res[] = addOne(arr);
        for(int i : res) {
            System.out.print(i);
        }
    }
}
