package Practice;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        // Initialize a pointer for the position of non-val elements
        int index = 0;

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Assign it to the index position and increment the index
                nums[index] = nums[i];
                index++;
            }
        }
        // The index represents the count of elements not equal to val
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};  // Example input
        int val = 3;
        int count = removeElement(nums, val);

        System.out.println("Number of elements not equal to " + val + ": " + count);

        // Print the modified array (first 'count' elements)
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
        // Output: 2 2
    }
}

