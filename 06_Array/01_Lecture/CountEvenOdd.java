// Problem: Count even and odd numbers in arrays
// Date 25-Sep-2025

import java.util.Scanner;
public class CountEvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        System.out.print("Enter " + size + " elements: ");
        
        int CountEven = 0;
        int CountOdd = 0;

        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
            if(numbers[i] % 2 == 0){
                CountEven++;
            }else{
                CountOdd++;
            }
        }
        System.out.println("Even number in Array: " + CountEven);
        System.out.println("Odd number in Array: " + CountOdd);

        sc.close();

    }
}
