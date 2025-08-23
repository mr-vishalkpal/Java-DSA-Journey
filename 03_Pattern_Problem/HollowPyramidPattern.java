// Problem: Print Hollow Pyramid pattern
// Author: Vishal Kumar Pal
// Date: 23-Aug-2025

import java.util.Scanner;

public class HollowPyramidPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking input number for rows
        System.out.print("Enter a number for rwo: ");
        int num = sc.nextInt();

        // for loop
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= (num - i); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1) || i == num) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }

            System.out.println();

        }
        sc.close();
    }    
}
