class Solution {
    int[] t;
    public int solve(int[] coins, int amount){
        if(amount==0){
            return 0;
        }
        if(t[amount]!=-1){
            return t[amount];
        }
        int res=Integer.MAX_VALUE;
        for(int coin:coins){
            if(amount-coin>=0){
                int subProblem = solve(coins, amount - coin);

                if (subProblem != Integer.MAX_VALUE) {
                    res = Math.min(res, 1 + subProblem);
                }
            }
        }

        return t[amount]=res;
    }
    public int coinChange(int[] coins, int amount) {
        t=new int[amount+1];
        Arrays.fill(t,-1);
        int minCost=solve(coins,amount);
        return minCost==Integer.MAX_VALUE?-1:minCost;
    }
}
