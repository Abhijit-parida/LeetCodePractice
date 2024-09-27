package Practice;

public class FindFirstOccurrence {

    public static int strStr(String haystack, String needle) {
        // Edge case: if needle is empty, return 0 (as per the problem's typical requirement)
        if (needle.isEmpty()) {
            return 0;
        }

        // Length of the needle and haystack
        int needleLength = needle.length();
        int haystackLength = haystack.length();

        // Iterate through haystack, only go up to the point where needle can still fit
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            // Check if the substring of haystack starting at i matches needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; // Return the starting index if a match is found
            }
        }

        // If no match was found, return -1
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));  // Output: 2

        haystack = "leetcode";
        needle = "leeto";
        System.out.println(strStr(haystack, needle));  // Output: -1

        haystack = "sadbutsad";
        needle = "sad";
        System.out.println(strStr(haystack, needle));  // Output: 0
    }
}

