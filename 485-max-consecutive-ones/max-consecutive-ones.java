class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int temp = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                temp++;
            }
            else if(nums[i] == 0){
                if(temp > count){
                    count = temp;
                }
                temp = 0;
            }
        }

        if(temp > count){
            count = temp;
        }
        return count;

    }
}