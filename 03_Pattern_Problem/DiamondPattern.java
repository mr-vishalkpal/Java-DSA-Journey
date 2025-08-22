// Problem: Print Diamomd Pattern
// Author: Vishal kumar Pal
// Date: 22-Aug-2025

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking input number for rows
        System.out.print("Enter a number of rows: ");
        int num = sc.nextInt();

        // loop for pyramid
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num - 1; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lopp for Inverted pyramid
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
