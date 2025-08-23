// Problem: Print Hoolow Diamond pattern *
// Author Vishal Kumar Pal
// Date: 23-Aug-2025

import java.util.Scanner;

public class HollowDiamondPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // taking input number for row
        System.out.print("Enter a number for row: ");
        int num = sc.nextInt();

        // 1st Loop for Hollow Pyramid Pattern
        for (int i = 1; i <= num; i++) {
            // spaces
            for(int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i - 1); j++){
                // condition
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

        // 2nd Loop for Hollow Inverted Pyramid Pattern
        for (int i = num - 1; i >= 1; i--){
            // spaces
            for (int j = 1 ; j <= num - i; j++){
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                // condition
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
            }

            System.out.println();
        }
        sc.close();
    }
}
