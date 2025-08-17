// Problem: Find a^b using loop
// Author: Vishal Kumar Pal
// Date: 17-Aug-2025

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter base (a): ");
        int base = sc.nextInt();

        System.out.print("Enter exponent (b): ");
        int exp = sc.nextInt();

        // Power calculation using loop
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }

        System.out.println(base + "^" + exp + " = " + result);

        sc.close();
    }
}
