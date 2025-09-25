// Problem: Take n elements as input in an array and print them
// Author: Vishal Kumar Pal
// Date: 25-Sep-2025

import java.util.Scanner;
public class PrintArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter " + size + " elements: ");
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i = 0; i < size; i++){
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}
