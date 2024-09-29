package com.practice.leetcode;

/**
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.
 */

public class ValidParentheses {

    public static boolean isValid(String s) {

        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                // If the string becomes empty, it indicates all brackets are matched.
                return s.isEmpty();
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "({[}])";  // Example input
        String s2 = "[]{}()";
        String s3 = "([{([])}])";
        System.out.println("Is '"+s1+"' valid: "+isValid(s1));
        System.out.println("Is '"+s2+"' valid: "+isValid(s2));
        System.out.println("Is '"+s3+"' valid: "+isValid(s3));
    }
}