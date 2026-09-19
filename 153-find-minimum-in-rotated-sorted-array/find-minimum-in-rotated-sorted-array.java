class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int high = n-1;
        int low = 0;
        int target = 0;
        int mid = 0;

        if (nums.length == 1 || nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }

        while(low < high){
            mid = low + (high - low)/2;
            if(nums[mid] <= nums[high]){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return nums[low];
    }
}