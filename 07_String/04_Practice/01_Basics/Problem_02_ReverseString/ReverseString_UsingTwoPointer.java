// Problem: Given a string s, reverse the string. Reversing a string means rearranging the characters such that the first character becomes the last, the second character becomes second last and so on.
// Solution: Using Two Pointer
// Date: 08-04-2026

public class ReverseString_UsingTwoPointer {
    
    static String reverseString(String s) {
        int left = 0, right = s.length() - 1;
      
        // Use StringBuilder for mutability
        StringBuilder res = new StringBuilder(s);
      
       
        while (left < right) {
            char temp = res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp);
            left++;
            right--;
        }
  
        // Convert StringBuilder back to string
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abdcfe";
        System.out.println(reverseString(s));
    }
}
