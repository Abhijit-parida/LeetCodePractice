package com.practice.leetcode;

/**
    You are given a large integer represented as an integer array digits,
    where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order.
    The large integer does not contain any leading 0's.
    Increment the large integer by one and return the resulting array of digits.
 */

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the last digit
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, simply increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // Set the current digit to 0 if it's 9 (handle carry)
            digits[i] = 0;
        }

        // If all digits are 9, we need to add a leading 1
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne(digits1);
        printArray(result1);  // Output: [1, 2, 4]

        int[] digits2 = {9, 3, 2, 9};
        int[] result2 = plusOne(digits2);
        printArray(result2);  // Output: [4, 3, 2, 2]

        int[] digits3 = {9, 9, 9};
        int[] result3 = plusOne(digits3);
        printArray(result3);  // Output: [1, 0, 0, 0]
    }

    // Helper method to print an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

