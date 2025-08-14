// Problem: Check Leap year or not
// Author: Vishal Kumar Pal
// Date: 14-Aug-2025

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Taking year input ffrom user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        //Leap year logic
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap year");
        }

        sc.close();
    }
}