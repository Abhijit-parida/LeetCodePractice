package com.practice.leetcode;

import java.util.Scanner;

/**
    Given an array of integers 'number' and an integer 'target',
    return indices of the two numbers such that they add up to target.
 */

public class TargetMatch {

    public int[] twoSum() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of element Stored in Array: ");
        int element = scan.nextInt();

        int[] num = new int[element];

        System.out.println("Enter list of Array as per element:");
        for ( int i = 0; i < element; i++) {
            num[i] = scan.nextInt();
        }

        System.out.print("Enter the target you want to matched: ");
        int target = scan.nextInt();

        for (int i = 0; i < num.length-1; i++) { // for 1st index
            for (int j = i+1; j < num.length; j++) { // for next index
                if (num[i] + num[j] == target) { // add those index value and compare with target
                    return new int[] {i,j};  // if matched it will store in new array
                }
            }
        }
        return new int[]{}; // if no solution found
    }

    public static void main(String[] args) {

        TargetMatch tr = new TargetMatch();
        int[] finalResult = tr.twoSum();
        for (int x : finalResult) {
            System.out.println("index of "+"["+x+"]");
        }
        System.out.println("These two index value matched the target");
    }
}
