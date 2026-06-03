class Solution {
    int[] memo;
    public int solve(int[] cost, int i){
        if(i>=cost.length){
            return 0;
        }
        if(memo[i]!=-1){
            return memo[i];
        }
       /* return cost[i]+Math.min(solve(cost,i+1),solve(cost,i+2));*/
        memo[i]=cost[i]+Math.min(solve(cost,i+1),solve(cost,i+2));
        return memo[i];
    }
    public int minCostClimbingStairs(int[] cost) {
       /* int n=cost.length;

        if(n==2){
            return Math.min(cost[0],cost[1]);
        }

        for(int i=2;i<n;i++){
            cost[i]=cost[i]+Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[n-1],cost[n-2]);*/
        memo=new int[cost.length];
        Arrays.fill(memo,-1);
        return Math.min(solve(cost,0),solve(cost,1));
    }
}
