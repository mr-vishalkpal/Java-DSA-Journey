// Problem: Count the number of digits in a given number
// Author: Vishal Kumar Pal
// Date: 16-Aug-2025

import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        // If number is 0, it has 1 digit
        if (num == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (temp != 0) {
                temp = temp / 10; // Remove last digit
                count++;         // increase digit cout
            }
        }

        System.out.println("Number of  digits = " + count);

        sc.close();
    }
}
