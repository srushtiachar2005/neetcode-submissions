class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;

        int l=0;
        int r=0;
        int n=nums.length;
        int sum=0;
        while(r<n){
            sum+=nums[r];
            while(sum>=target){
                ans=Math.min(ans,r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;

        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}