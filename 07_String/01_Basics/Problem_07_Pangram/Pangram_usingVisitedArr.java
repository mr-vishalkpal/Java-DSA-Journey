// Problem: Given a string s, check if it is Pangram or not. 
// Solution: using searching
// Date: 19-04-2026

import java.util.*;
public class Pangram_usingVisitedArr {
    

    static final int MAX_CHAR = 26; 
    public static boolean checkPangram(String s) {
        boolean[] vis = new boolean[MAX_CHAR];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
                vis[c - 'A'] = true;
            else if (c >= 'a' && c <= 'z')
                vis[c - 'a'] = true;
        }
        for (int i = 0; i < MAX_CHAR; i++) {
            if (!vis[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the dog";
        System.out.println(checkPangram(s) ? "true" : "false");
    }
}
