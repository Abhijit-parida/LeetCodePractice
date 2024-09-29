package com.practice.leetcode;

/**
    Given a string s consisting of words and spaces,
    return the length of the last word in the string.
 */

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        String newStr = s.trim();

        int length = 0;
        int i = newStr.length()-1;

        while (i>=0 && newStr.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1));  // Output: 5

        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s2));  // Output: 4

        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s3));  // Output: 6
    }
}

