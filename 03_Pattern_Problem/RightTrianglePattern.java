// Problem: Print right-angle triangle of *
// Author: Vishal Kumar Pal
// Date: 18-Aug-2025

import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // input for number of rows
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        // outer loop -> rows
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {  // print star equal to row number
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
