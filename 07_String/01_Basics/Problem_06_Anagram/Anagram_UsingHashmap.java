// Problem: Given two non-empty strings s1 and s2 of lowercase letters, determine if they are anagrams
// Solution: Using Sorting
// Date: 16-04-2026

import java.util.HashMap;

public class Anagram_UsingHashmap {
    
    static boolean areAnagrams(String s1, String s2) {
        
        if(s1.length() != s2.length()){
            return false;
        }
        
        // create a hashmap to store 
        // character frequencies
        HashMap<Character, Integer> charCount =
                                    new HashMap<>();
        
        // count frequency of each
        // character in string s1
        for (char ch : s1.toCharArray()) 
            charCount.put(ch,
                    charCount.getOrDefault(ch, 0) + 1);
  
        // count frequency of each
        // character in string s2
        for (char ch : s2.toCharArray()) 
            charCount.put(ch,
                    charCount.getOrDefault(ch, 0) - 1);
  
        // check if all frequencies are zero
        for (var pair : charCount.entrySet()) {
            if (pair.getValue() != 0) {
                return false;
            }
        }
        
       
        return true;
    }

    public static void main(String[] args) {
        
        String s1 = "geeks";
        String s2 = "kseeg";
        System.out.println(areAnagrams(s1, s2) ? "true" : "false");
        
    }
    
}
