class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n]; 
        int temp = 0;

        for(int i = 0; i < (2*n); i++){
            if(i < n){
                temp = nums[i];
                ans[i] = temp;
            }
            else{
                temp = nums[i-n];
                ans[i] = temp;
            }
        }

        return ans;

    }
}