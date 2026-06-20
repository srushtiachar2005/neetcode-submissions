class Solution {
    int[][] dp;

    public int solve(int[] prices, int buy, int idx) {
        if (idx == prices.length) {
            return 0;
        }

        if (dp[idx][buy] != -1) {
            return dp[idx][buy];
        }

        int profit;

        if (buy == 1) {
            profit = Math.max(
                -prices[idx] + solve(prices, 0, idx + 1), // buy
                solve(prices, 1, idx + 1)                 // skip
            );
        } else {
            profit = Math.max(
                prices[idx] + solve(prices, 1, idx + 1),  // sell
                solve(prices, 0, idx + 1)                 // hold
            );
        }

        return dp[idx][buy] = profit;
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;

        dp = new int[n][2];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(prices, 1, 0);
    }
}