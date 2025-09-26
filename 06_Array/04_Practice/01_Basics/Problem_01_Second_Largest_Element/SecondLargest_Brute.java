// Probelm: Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.
// Solution: Burteforce Approcach
// Date: 26-Sep-2025

import java.util.Scanner;
public class SecondLargest_Brute {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of Arrays: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        System.out.print("Enter " + size + " elements: ");
        
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        if(size < 2){
            System.out.println("Array must have at least 2 elements.");
            return;
        }

        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - 1 - i; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        for(int i = size - 2; i >= 0; i--){
            if(numbers[i] != numbers[size - 1]){
                System.out.println("Second largest element is: " + numbers[i]);
                return;
            }
        }
        

        System.out.println("No second largest element found.");
        sc.close();
        
    }    
}
