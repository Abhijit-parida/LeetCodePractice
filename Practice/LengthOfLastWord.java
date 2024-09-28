package Practice;

/**
    Given a string s consisting of words and spaces,
    return the length of the last word in the string.
 */

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Start from the end of the string and skip any trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
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

