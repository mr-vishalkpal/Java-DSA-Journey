// Problem: Given a string s, reverse the string. Reversing a string means rearranging the characters such that the first character becomes the last, the second character becomes second last and so on.
// Solution: Using Stack
// Date: 09-04-2026

import java.util.*;

public class ReverseString_Stack {
    
    static String reverseString(String s) {
        Stack<Character> st = new Stack<>();
      
        // Push the characters into stack
        for (int i = 0; i < s.length(); i++)
            st.push(s.charAt(i));

        StringBuilder res = new StringBuilder();
      
        // Pop the characters of stack into the original string
        for (int i = 0; i < s.length(); i++)
            res.append(st.pop());
        
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abdcfe";
        System.out.println(reverseString(s));
    }
}
