package com.practice.leetcode;

import java.util.HashMap;

/**
    Given a roman numeral, convert it to an integer.
 */

public class RomanToInteger {

    public static int romanToInt(String s) {
        // Create a map to store Roman numerals and their corresponding values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        // Traverse through the Roman numeral string
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanMap.get(s.charAt(i));

            // Check if the next character exists and its value is greater than the current one
            if (i + 1 < s.length() && romanMap.get(s.charAt(i + 1)) > currentValue) {
                // Subtract the current value if next value is larger
                result -= currentValue;
            } else {
                // Otherwise, add the current value
                result += currentValue;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String roman1 = "MCMXCIV";  // Example: 1994
        System.out.println("Integer number of roman '"+roman1+"' is "+romanToInt(roman1));  // Output: 1994
    }
}
