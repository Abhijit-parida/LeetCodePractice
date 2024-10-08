package com.practice.leetcode;

/**
    You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

public class ClimbStairs {

    // 1st Way
    public static int climbStairs1(int n) {
        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];  // dp[i] represents the number of ways to reach step i
        dp[1] = 1;
        dp[2] = 2;

        // Fill the dp array using the relation dp[i] = dp[i - 1] + dp[i - 2]
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];  // The number of ways to reach the nth step
    }

    // 2nd Way
    public static int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }

        int first = 1;
        int second = 2;

        // Use two variables to store the last two values instead of an array
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs1(n));  // Output: 8
        System.out.println(climbStairs2(n));  // Output: 8

        n = 3;
        System.out.println(climbStairs1(n));  // Output: 3
        System.out.println(climbStairs2(n));  // Output: 3
    }
}

