// problem: Given a sentence s, determine whether it is a palindrome sentence or not. A palindrome sentence is a sequence of characters that reads the same forward and backward after:
// Solution: Comparing original and reversed 
// Date: 23-04-2026


public class SentencePalindrome_usingN{
     static boolean isPalinSent(String s) {
  
        // create a new string having only 
        // alphanumeric characters
        StringBuilder s1 = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                s1.append(Character.toLowerCase(ch));
            }
        }
  
        // find reverse of this new string
        StringBuilder rev = new 
                StringBuilder(s1.toString());
        rev.reverse();
  
        // compare string and its reverse
        return s1.toString().equals(rev.toString());
    }

    public static void main(String[] args) {
        
        String s = "Too hot to hoot.";
        System.out.println(isPalinSent(s)
                           			? "true" : "false");
    }

}