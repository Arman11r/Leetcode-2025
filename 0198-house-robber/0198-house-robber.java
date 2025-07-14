class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return ans(nums,0,dp);
        
    }

    public int ans(int[] nums, int i,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int robbinggggg = nums[i] + ans(nums,i+2,dp);
        int notrobbing = ans(nums,i+1,dp);
        return dp[i]=Math.max(robbinggggg,notrobbing);
    }
}