// Problem: Given a string s of lowercase English letters, the task is to find the first non-repeating character. If there is no such character, return '$'.
// Solution: Using Nested Loop
// Date: 14-04-2026


public class FirstNonRepeatingchar {
    
    public static char nonRep(String s) {
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            boolean found = false;

            for (int j = 0; j < n; ++j) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) 
                return s.charAt(i);
        }

        return '$';
    }

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(nonRep(s));
    }
}
