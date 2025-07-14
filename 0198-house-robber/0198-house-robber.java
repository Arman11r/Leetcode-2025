class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        //return ans(nums,nums.length-1,dp);
        if(nums.length == 1){
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            int rob = nums[i]+dp[i-2];
            int dontrob = dp[i-1];
            dp[i] = Math.max(rob,dontrob);
        }
        return dp[dp.length-1];
        
    }


    // public int ans(int[] nums, int i,int[] dp){
    //     if(i>=nums.length){
    //         return 0;
    //     }
    //     if(dp[i] != -1){
    //         return dp[i];
    //     }
    //     int robbinggggg = nums[i] + ans(nums,i+2,dp);
    //     int notrobbing = ans(nums,i+1,dp);
    //     return dp[i]=Math.max(robbinggggg,notrobbing);
    // }
}