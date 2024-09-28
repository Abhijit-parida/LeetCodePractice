package Practice;

/**
    Given a sorted array of distinct integers and a target value, return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.
 */

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;  // Target found, return its index
            } else if (nums[mid] < target) {
                left = mid + 1;  // Move the left boundary to mid + 1
            } else {
                right = mid - 1;  // Move the right boundary to mid - 1
            }
        }
        // Target not found, left is the insert position
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};

        int target = 5;
        System.out.println(searchInsert(nums, target));  // Output: 2

        target = 2;
        System.out.println(searchInsert(nums, target));  // Output: 1

        target = 7;
        System.out.println(searchInsert(nums, target));  // Output: 4

        target = 0;
        System.out.println(searchInsert(nums, target));  // Output: 0
    }
}

