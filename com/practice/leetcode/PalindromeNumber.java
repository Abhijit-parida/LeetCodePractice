package com.practice.leetcode;

/**
    Given an integer x, return true if x is a palindrome, and false otherwise.
 */

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        // If x is negative, it cannot be a palindrome
        if (x < 0) {
            return false;
        }

        int original = x;
        int duplicate = 0;

        while (x != 0) {
            int reminder = x % 10;
            duplicate = duplicate * 10 + reminder;
            x /= 10;
        }

        // Check if the original number is equal to the reversed number
        return original == duplicate;
    }

    public static void main(String[] args) {
        int number1 = 121;  // You can change this to test with other numbers
        int number2 = -121;
        int number3 = 1598951;
        System.out.println("Is int value '"+number1+"' Palindrome? "+isPalindrome(number1));  // Output: true
        System.out.println("Is int value '"+number2+"' Palindrome? "+isPalindrome(number2));  // Output: false
        System.out.println("Is int value '"+number3+"' Palindrome? "+isPalindrome(number3));  // Output: true
    }
}

