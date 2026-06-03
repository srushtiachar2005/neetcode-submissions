class Solution {
    public int rob(int[] nums) {
     /*   
        int n=nums.length;

        return solve(nums,0,n);
    }

    public int solve(int[] nums,int i,int n){
        if(i>=nums.length)
            return 0;
        int steal=nums[i]+solve(nums,i+2,n);
        int skip=solve(nums,i+1,n);
        return Math.max(steal,skip);*/

        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp=new int[n+1];

        dp[0]=0;
        dp[1]=nums[0];
        int ans=0;
        for(int i=2;i<=nums.length;i++){
            int steal=nums[i-1]+dp[i-2];
            int skip=dp[i-1];
            dp[i]=Math.max(skip,steal);
        }
        return dp[n];
    }
}
