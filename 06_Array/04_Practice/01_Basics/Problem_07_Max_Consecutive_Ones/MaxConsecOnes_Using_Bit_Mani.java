// Problem: Given a binary array arr[] consisting of only 0s and 1s, find the length of the longest contiguous sequence of either 1s or 0s in the array.
// Solution: Using Bit Manipulation
// Date: 01-03-2026
// Author: Vishal Kumar

import java.util.Arrays;

public class MaxConsecOnes_Using_Bit_Mani {
    static int maxConsecBits(int arr[]){

        if(arr.length == 0) return 0;

        int maxCount = 0, count = 0, prev = -1;

        for(int num : arr) {
            
            //If the current number is the same as the previous number
            if((prev ^ num) == 0) {
                count++;
            }
            else{

                // Update maxCount and reset count
                maxCount = Math.max(maxCount, count);
                count = 1;
            }

            prev = num;
        }

        return Math.max(maxCount, count);
    }    

    public static void main(String args[]){
        
        int arr[] = {0, 1, 0, 1, 1, 1, 1};

        System.out.println(maxConsecBits(arr));
    }
}
