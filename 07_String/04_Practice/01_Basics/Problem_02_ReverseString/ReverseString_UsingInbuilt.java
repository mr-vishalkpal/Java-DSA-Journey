// Problem: Given a string s, reverse the string. Reversing a string means rearranging the characters such that the first character becomes the last, the second character becomes second last and so on.
// Solution: Using Recursion
// Date: 10-04-2026

import java.io.*;
import java.util.*;

public class ReverseString_UsingInbuilt{

    static String stringReverse(String s) {
    	StringBuilder res = new StringBuilder(s);
        res.reverse();
      	return res.toString();
    }
  	
    public static void main(String[] args) {
        String s = "abdcfe";
        System.out.println(stringReverse(s));
    }

}