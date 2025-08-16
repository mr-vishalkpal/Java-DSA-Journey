// Problem: Reverse the digits of given number
// Author: Vishal Kumar Pal
// Date: 16-Aug-2025

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking numberr input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0; // To store Reversed digit

        // Loop until number becomes 0
        while (num != 0) {
            int digit = num % 10; // Get last digit
            reversed = reversed * 10 + digit; // Append digit in reverse
            num = num / 10;
        }

        System.out.println("Reversed number = " + reversed);

        sc.close();
    }
    
}
