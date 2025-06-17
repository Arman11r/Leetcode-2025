class Solution {

    static int[][] dp;

    static int coinChange(int[] coins, int sum) {
        dp = new int[coins.length][sum + 1];
        for (int[] row : dp) Arrays.fill(row, -1); 

        int ans = helper(0, sum, coins);
        return ans != Integer.MAX_VALUE ? ans : -1;
    }

    static int helper(int i, int sum, int[] coins) {
        if (sum == 0) return 0;
        if (sum < 0 || i == coins.length) return Integer.MAX_VALUE;

        if (dp[i][sum] != -1) return dp[i][sum];

        int take = Integer.MAX_VALUE;
        if (coins[i] <= sum) {
            int res = helper(i, sum - coins[i], coins);
            if (res != Integer.MAX_VALUE) take = res + 1;
        }

        int noTake = helper(i + 1, sum, coins);

        dp[i][sum] = Math.min(take, noTake);
        return dp[i][sum];
    }
}