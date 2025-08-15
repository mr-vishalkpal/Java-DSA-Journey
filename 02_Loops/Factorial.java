// Problem: Factorial Of a number
// Author: Vishal kumar Pal
// Date: 15-Aug-2025

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking number from user
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        long fact = 1; // To store factorial

        // Loop from 1 to n
        for (int i = 1; i <= num; i++) {
            fact *= i; 
        }

        System.out.println("Factorial of " + num + " = " + fact);

        sc.close();
    }    
}
