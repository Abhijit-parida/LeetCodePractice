package com.practice.leetcode;

/**
    Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
    The returned integer should be non-negative as well.
 */

public class Sqrt {

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;  // The square root of 0 is 0, and the square root of 1 is 1
        }

        int left = 1, right = x, result = 0;

        // Binary search to find the square root
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If mid * mid == x, we've found the exact square root
            if (mid == x / mid) {
                return mid;
            }

            // If mid * mid is less than x, search the right half and store mid as a possible result
            if (mid < x / mid) {
                result = mid;  // Store mid as the current best candidate
                left = mid + 1;
            }
            // If mid * mid is greater than x, search the left half
            else {
                right = mid - 1;
            }
        }

        return result;  // The result contains the floor value of the square root
    }

    public static void main(String[] args) {
        int x1 = 4;
        System.out.println(mySqrt(x1));  // Output: 2

        int x2 = 16;
        System.out.println(mySqrt(x2));  // Output: 4

        int x3 = 27;
        System.out.println(mySqrt(x3));  // Output: 5
    }
}

