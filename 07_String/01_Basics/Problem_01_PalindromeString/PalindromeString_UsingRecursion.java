// Problem: Given a string s, the task is to check if it is palindrome or not.
// Solution: Using Recursion
// Date: 06-04-2026

public class PalindromeString_UsingRecursion {
    
    static int isPalindromeUtil(String s, int left, int right){

        if(left >= right)
            return 1;

        if(s.charAt(left) != s.charAt(right))
            return 0;

        return isPalindromeUtil(s, left + 1, right - 1);
    }

    static int isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        return isPalindromeUtil(s, left, right);
    }

    public static void main(String args[]){
        String s = "abba";
        System.out.println(isPalindrome(s));
    }
}
