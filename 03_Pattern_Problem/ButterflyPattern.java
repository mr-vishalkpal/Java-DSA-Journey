// Problem: Print butterfly *
// Author: Vishal Kumar Pal
// Date: 25-Aug-2025

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String  args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking input for roe
        System.out.print("Enter a number for row: ");
        int num = sc.nextInt();

        // For loop upper half
        for (int i = 1; i <= num; i++) {

            // left star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in middle
            for (int j = 1; j <= 2*(num - i); j++){
                System.out.print(" ");
            }

            // Right star
             for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int i = num - 1; i >= 1; i--) {

            // left star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in middle
            for (int j = 1; j <= 2*(num - i); j++){
                System.out.print(" ");
            }

            // Right star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
