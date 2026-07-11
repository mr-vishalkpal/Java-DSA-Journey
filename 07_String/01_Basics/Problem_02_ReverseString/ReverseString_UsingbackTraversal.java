// Problem: Given a string s, reverse the string. Reversing a string means rearranging the characters such that the first character becomes the last, the second character becomes second last and so on.
// Solution: BackTraversal
// Date: 07-04-2026

public class ReverseString_UsingbackTraversal {
    
    static String reverseString(String s) {
        StringBuilder res = new StringBuilder();
  
        // Traverse on s in backward direction
        // and add each character to a new string
        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abdcfe";
        String res = reverseString(s);
        System.out.print(res);
    }
}
