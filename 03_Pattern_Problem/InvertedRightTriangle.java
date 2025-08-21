// Proble: Print Inverted right triangle pattern
// Author: Vishal Kumar Pal
// Date: 21-Aug-2025

import java.util.Scanner;

public class InvertedRightTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // input for number of rows
        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        // outer loop -> rows
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // mover to the next line
        }

        sc.close();
    }
}
