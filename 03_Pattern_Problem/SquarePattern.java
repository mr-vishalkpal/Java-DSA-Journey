// Problem: Print Square of *
// Author: Vishal Kumar Pal
// Date: 18-Aug-2025

import java.util.Scanner;


public class SquarePattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // input for size of square
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        // outer loop -> rows
        for (int i = 1; i <= num; i++) {
            // inner loop coloumns
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }    
}
