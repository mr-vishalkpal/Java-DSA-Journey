// Problem: Given a number, in the form of an array num[] of size n containing digits from 1 to 9(inclusive). Find the next smallest palindrome strictly larger than the given number.
// Solution: Using All possible
// Date: 24-03-2026
// Author: Vishal Kumar


import java.util.ArrayList;
import java.util.Arrays;


public class NextSmallPali_UsingMirrorCarryPropa {

    static boolean areAll9s(int[] num) {
        for (int d : num) {
            if (d != 9) return false;
        }
        return true;
    }

    // generate the next palindrome
    static void nextPalindromeUtil(int[] num) {
        int n = num.length;
        int mid = n / 2;
        boolean leftSmaller = false;

        int i = mid - 1;
        int j = (n % 2 == 1) ? mid + 1 : mid;

        // Compare the left side with the right side
        while (i >= 0 && num[i] == num[j]) {
            i--;
            j++;
        }

        // Check if we need to increment the middle digit(s)
        if (i < 0 || num[i] < num[j]) leftSmaller = true;

        // Copy the left half to the right half
        while (i >= 0) {
            num[j++] = num[i--];
        }

        // If middle digits need to be incremented
        if (leftSmaller) {
            int carry = 1;
            i = mid - 1;

            if (n % 2 == 1) {
                num[mid] += carry;
                carry = num[mid] / 10;
                num[mid] %= 10;
                j = mid + 1;
            } else {
                j = mid;
            }

            while (i >= 0) {
                num[i] += carry;
                carry = num[i] / 10;
                num[i] %= 10;
                num[j++] = num[i--];
            }
        }
    }

    static ArrayList<Integer> nextPalindrome(int[] num) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (areAll9s(num)) {
            ans.add(1);
            for (int i = 1; i < num.length; i++) ans.add(0);
            ans.add(1);
            return ans;
        }

        nextPalindromeUtil(num);
        for (int d : num) ans.add(d);
        return ans;
    }

    public static void main(String[] args) {
        int[] num = {9,4,1,8,7,9,7,8,3,2,2};
        ArrayList<Integer> res = nextPalindrome(num);
        System.out.println(res);
    }
}
