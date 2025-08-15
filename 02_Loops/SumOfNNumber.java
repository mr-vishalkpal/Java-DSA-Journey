// Problem: Sum of N Natural Numbers
// Author: Vishal Kumar Pal
// Date: 15-Aug-2025

import java.util.Scanner;

public class SumOfNNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Taking value of N from user
        System.out.print("Enter a Positive Integer N: ");
        int num = sc.nextInt();

        int sum = 0; // variable to store sum

        // Loop from 1 to N
        for (int i = 1; i <= num; i++) {
            sum += i; 
        }

        System.out.println("Sum of first " + num + " natural numbers = " + sum);

        sc.close();
    }
}
