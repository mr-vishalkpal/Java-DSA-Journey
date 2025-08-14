// Problem: Simple Calculator using switch case
// Author: Vishal Kumar Pal
// Date: 14-Aug-2025

import java.util.Scanner;

public class SimpleCalc {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the first Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);  // Read the first character of the user input

        // Logic using switch-case
        switch (operator) {
            case '+':
                System.out.println("Result of " + num1 + " " + operator + " " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result of " + num1 + " " + operator + " " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result of " + num1 + " " + operator + " " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println("Result of " + num1 + " " + operator + " " + num2 + " = " + (num1 / num2));
                break;
            case '%':
                System.out.println("Result of " + num1 + " " + operator + " " + num2 + " = " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}