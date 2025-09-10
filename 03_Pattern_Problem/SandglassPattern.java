// Problem: Sandglass Patern Probem
// Author: Vishal kumar Pal
// Date: 10-Sept-2025

import java.util.Scanner;
public class SandglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input for number of rows
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        //  Upper Inverted Pyramid
        for (int i = num; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Pyramid
        for (int i = 2; i <= num; i++) {
            // spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
