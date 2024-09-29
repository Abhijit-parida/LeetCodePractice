package com.practice.leetcode;

/**
    Given an integer array nums sorted in non-decreasing order,
    remove the duplicates in-place such that each unique element appears only once.
    The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 */

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        // Edge case: if the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }
        int uniqueIndex = 1;
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one
            if (nums[i] != nums[i - 1]) {
                // Assign the unique element to the uniqueIndex position
                nums[uniqueIndex] = nums[i];
                // Move the uniqueIndex pointer to the next position
                uniqueIndex++;
            }
        }
        // Return the number of unique elements
        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] num1 = {0,0,1,1,1,2,2,3,3,4};  // Example input
        int k = removeDuplicates(num1);

        // Print the modified array
        for (int i = 0; i < k; i++) {
            System.out.print(num1[i] + " ");
        }
        // Output: 0 1 2 3 4
    }
}

