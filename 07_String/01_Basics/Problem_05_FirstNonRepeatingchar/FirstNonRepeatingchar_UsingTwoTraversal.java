// Problem: Given a string s of lowercase English letters, the task is to find the first non-repeating character. If there is no such character, return '$'.
// Solution: Using Nested Loop
// Date: 14-04-2026


public class FirstNonRepeatingchar_UsingTwoTraversal {
    

     private static final int MAX_CHAR = 26;  

    public static char nonRep(String s) {
        int[] freq = new int[MAX_CHAR];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Find the first character with frequency 1
        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(nonRep(s));
    }
}
