class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(sol(cost,0,dp),sol(cost,1,dp));
    }

    public int sol(int[] cost, int i,int[] dp){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i] != -1){
           return dp[i];
        }
         
        int  p1 = sol(cost,i+1,dp);
        int p2 = sol(cost,i+2,dp);
        return dp[i] = Math.min(p1,p2)+cost[i];

    }
}