// Problem: Given a string s, the task is to check if it is palindrome or not.
// Solution: Using Single Variable
// Date: 06-04-2026

public class PalindromeString_UsingSingleVar {
    
    public static int isPalindrome(String s){
        int len = s.length();

        for(int i = 0; i < len / 2; i++){

            if(s.charAt(i) != s.charAt(len - i - 1))

                return 0;
        }

        return 1;
    }

    public static void main(String args[]){
        String s = "abba";
        System.out.println(isPalindrome(s));
    }
}
