// Problem: Find maximum and minimum elements in array
// Author: Vishal kumar Pal
// Date: 25-Sep-2025

import java.util.Scanner;

public class FindMaxMin {
    public static void findMaxMin(int num[]) {

        int max = Integer.MIN_VALUE; // -infinity
        int min = Integer.MAX_VALUE; // +infinity
        for(int i = 0; i < num.length; i++){
           if(num[i] > max){
               max = num[i];
           }
           if(num[i] < min){
            min = num[i];
           }
        }
         System.out.println("Maximum element: " + max);
         System.out.println("Minimum element: " + min);
       
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        System.out.println("Enter " + size + " Elements: ");
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        findMaxMin(numbers);

        sc.close();
    }
}
