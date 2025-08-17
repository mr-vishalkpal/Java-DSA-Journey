// Problem: First N terms of Fibonacci Series
// Author: Vishal Kumar Pal
// Date: 17-Aug-2025

import java.util.Scanner;


public class FibonacciSeries {
    public static  void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of terms: ");
        int num = sc.nextInt();

        int a = 0, b = 1;  // first two terms

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;

        }

        sc.close();
    }
}
