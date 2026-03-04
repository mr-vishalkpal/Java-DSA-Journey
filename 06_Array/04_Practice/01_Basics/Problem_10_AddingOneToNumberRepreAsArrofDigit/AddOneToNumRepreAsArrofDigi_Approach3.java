// Problem: Given a non-negative number represented as an array of digits. The task is to add 1 to the number (increment the number represented by the digits by 1). The digits are stored such that the most significant digit is the first element of the array.
// Solution: Using 3rd Approach
// Date: 04-03-2026
// Author: Vishal Kumar

import java.util.Arrays;

public class AddOneToNumRepreAsArrofDigi_Approach3 {
    
    // function to add one
    static int[] addOne(int arr[]) {

        // reverse the digits
        for(int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // initialize an index to start of array
        int index = 0;

        // while the index is valid and the value at index is 9
        while(index < arr.length && arr[index] == 9)
            arr[index++] = 0;

        // if index == arr.length(if all arr were  9)
        if(index == arr.length) {

            // insert an one at the end
            int newArr[] = new int[arr.length + 1];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            newArr[arr.length] = 1;
            arr = newArr;
        }

        // else increment the vaule at [index]
        else
            arr[index]++;

        // reverse the array
        for(int i = 0, j = arr.length - 1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }

    public static void main(String args[]) {
        int arr[] = {9, 9, 9};
        int res[] = addOne(arr);
        for(int i : res) {
            System.out.print(i);
        }
    }
}
