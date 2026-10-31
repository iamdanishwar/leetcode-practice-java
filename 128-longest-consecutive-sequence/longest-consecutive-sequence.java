import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 1;
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int maxCount = 1;

        for (int i = 0; i < n - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i] == nums[i + 1] - 1) {
                count++;
            } else {
                count = 1;
            }

            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}