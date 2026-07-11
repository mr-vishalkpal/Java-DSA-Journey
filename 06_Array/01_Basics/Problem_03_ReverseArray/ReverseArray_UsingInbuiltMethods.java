package Problem_03_ReverseArray;

// Problem: Revrse array
// Solution: Using Inbuilt Methods

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray_UsingInbuiltMethods {

    // function to reverse an array
    static void reverseArray(List<Integer> arr){
        Collections.reverse(arr);
    }

    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 6, 5));
    reverseArray(arr);
    for(int i = 0; i < arr.size(); i++){
        System.out.print(arr.get(i) +" ");
    }
    }
    
}
