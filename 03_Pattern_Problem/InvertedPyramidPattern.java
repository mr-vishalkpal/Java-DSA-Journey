// Problem: Print Inverted pyramid pattern using *
// Author: Vishal kumar Pal
// Date: 22-Aug-2025

import java.util.Scanner;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input number for rows
        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        // For loop
        for (int i = num; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
