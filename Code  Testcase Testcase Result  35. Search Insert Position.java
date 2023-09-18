//Java

//Binary Search technique used

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid; // Target found, return its index.
        } else if (nums[mid] < target) {
            left = mid + 1; // Target is in the right half of the current range.
        } else {
            right = mid - 1; // Target is in the left half of the current range.
        }
    }

    // Target is not found, and 'left' points to the index where it should be inserted.
    return left;
        
    }
}
