package com.practice.leetcode;

/**
    Given two binary strings a and b, return their sum as a binary string.
 */

public class AddBinary {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Traverse both strings from the end towards the beginning
        while (i >= 0 || j >= 0) {
            int sum = carry;

            // Add corresponding bits of a and b
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Append the current bit to the result (sum % 2 gives the binary digit)
            result.append(sum % 2);

            // Update the carry (sum / 2 gives the carry for the next digit)
            carry = sum / 2;
        }

        // If there's any remaining carry, append it to the result
        if (carry != 0) {
            result.append(carry);
        }

        // Reverse the result since we've added digits in reverse order
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));  // Output: "10101"

        a = "11";
        b = "1";
        System.out.println(addBinary(a, b));  // Output: "100"
    }
}

