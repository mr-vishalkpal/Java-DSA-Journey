// Problem: Given a string s, reverse the string. Reversing a string means rearranging the characters such that the first character becomes the last, the second character becomes second last and so on.
// Solution: Using Recursion
// Date: 09-04-2026


public class ReverseString_Recursion {
    
    static void reverseStringRec(char[] s, int l, int r) {
        if (l >= r)
            return;

        // Swap the characters at the ends
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;

        // Recur for the remaining string
        reverseStringRec(s, l + 1, r - 1);
    }

    // Function to reverse a string
    static String reverseString(String s) {
        char[] arr = s.toCharArray();
        reverseStringRec(arr, 0, arr.length - 1);
        return new String(arr);
    }
	
    public static void main(String[] args) {
        String s = "abdcfe";
        System.out.println(reverseString(s));
    }
}
