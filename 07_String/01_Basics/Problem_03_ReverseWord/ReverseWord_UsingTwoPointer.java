// Problem: Given a string s, find a way to reverse the order of the words in the given string.
// Solution: Using Stack
// Date: 11-04-2026


public class ReverseWord_UsingTwoPointer {
    

    public static String reverseWords(String s) {
        // Convert the string to a char array 
        // for in-place operations
        char[] chars = s.toCharArray();
        int n = chars.length;

        // Reverse the entire string
        reverse(chars, 0, n - 1);

        int i = 0;
        for (int l = 0; l < n; ++l) {
            if (chars[l] != '.') {

                // Add a dot between words if needed
                if (i != 0) chars[i++] = '.';

                // Find the end of the word
                int r = l;
                while (r < n && chars[r] != '.') chars[i++] = chars[r++];

                // Reverse the current word
                reverse(chars, i - (r - l), i-1);

                // Move to next word
                l = r;
            }
        }

        return new String(chars, 0, i);
    }

    // Utility to reverse part of the char array
    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void main(String[] args) {
        String s = "..geeks..for.geeks.";
        System.out.println(reverseWords(s));
    }
}
