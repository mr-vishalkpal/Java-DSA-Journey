// Problem: Check whether a nu ber is even or odd 
// Author: Vishal Kumar Pal
// Date: 13-Aug-2025

import java.util.Scanner;

public class EvenOdd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Conditional check
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is odd");
        }

        sc.close();
    }
}