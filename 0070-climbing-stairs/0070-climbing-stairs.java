class Solution {

    int[] dp;

    public int sol(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;

        
        if (dp[n] != -1) return dp[n];

       
        dp[n] = sol(n - 1) + sol(n - 2);
        return dp[n];
    }

    public int climbStairs(int n) {
     
        dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        return sol(n);
    }
}
