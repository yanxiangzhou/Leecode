class Solution {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int j = 1;j < nums.length; j++){
            ans = ans ^ nums[j];
        }
        return ans;
    } 
}