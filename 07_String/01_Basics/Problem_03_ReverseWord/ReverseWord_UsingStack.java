// Problem: Given a string s, find a way to reverse the order of the words in the given string.
// Solution: Using Stack
// Date: 11-04-2026

import java.util.Stack;

public class ReverseWord_UsingStack{

    static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder word = new StringBuilder();

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {

            // If not a dot, 
            // build the current word
            if (s.charAt(i) != '.') {
                word.append(s.charAt(i));
            }

            // If we see a dot, 
            // push the word into the stack
            else if (word.length() > 0) {
                stack.push(word.toString());
                word.setLength(0);  
            }
        }

        // Last word remaining,
        // push it to stack
        if (word.length() > 0) {
            stack.push(word.toString());
        }

        // Rebuild the string 
        // from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(".");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "..geeks..for.geeks.";
        System.out.println(reverseWords(s));
    }
    
}