// Problem: Print pyramind of *
// Author: Vishal Kumar Pal
// Date: 21-Aug-2025

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for nuumber of rows
        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        //outer loop -> rows
        for (int i = 1; i <= num; i++){
            // print spaces (n - i times)
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // print stars (2*i - 1 times)
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
