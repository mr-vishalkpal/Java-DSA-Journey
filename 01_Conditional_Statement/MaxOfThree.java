// Problem: Find the largest among three numbers
// Author: Vishal Kumar Pal
// Date: 13-Aug-2025

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Logic using if-else
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Largest number is " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Largest number is " + num2);
        } else {
            System.out.println("Largest number is " + num3);
        }

        sc.close();
    }
}
