// Problem: Given a number, in the form of an array num[] of size n containing digits from 1 to 9(inclusive). Find the next smallest palindrome strictly larger than the given number.
// Solution: Using All possible
// Date: 23-03-2026
// Author: Vishal Kumar

import java.util.*;

public class NextSmallPali_UsingAllPossible {
    
     static int checkPalindrome(List<Integer> num) {
        int n = num.size();
        for (int i = 0; i < n / 2; i++) {
            if (!num.get(i).equals(num.get(n - 1 - i))) {
                return 0;
            }
        }
        return 1;
    }

    static List<Integer> nextPalindrome(List<Integer> num) {
        int n = num.size();

        while (true) {

            // Add 1 to the number (always do this first)
            int carry = 1;
            for (int i = n - 1; i >= 0; i--) {
                num.set(i, num.get(i) + carry);
                if (num.get(i) == 10) {
                    num.set(i, 0);
                    carry = 1;
                } else {
                    carry = 0;
                    break;
                }
            }

            // If carry remains, insert 1 at beginning
            if (carry == 1) {
                num.add(0, 1);
                n++;
            }

            // Check if palindrome
            if (checkPalindrome(num) == 1) {
                break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(
            9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2
        ));

        List<Integer> res = nextPalindrome(num);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
