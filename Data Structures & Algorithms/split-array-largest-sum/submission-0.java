class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        int res=0;
        for(int n:nums){
            low=Math.max(low,n);
            high+=n;
        }

        res=high;

        while(low<=high){
            int mid=(low+high)/2;

            if(canSplit(nums,k,mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
    private boolean canSplit(int[] nums,int k, int largest){
        int subarray=1;
        int curSum=0;
        for(int num:nums){
            curSum+=num;
            if(curSum>largest){
                subarray++;
                if(subarray>k)return false;
                curSum=num;
            }
        }
        return true;
    }
}