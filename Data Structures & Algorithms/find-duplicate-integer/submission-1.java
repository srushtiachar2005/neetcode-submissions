class Solution {
    public int findDuplicate(int[] nums) {
       /* int slow=nums[0];
        int fast=nums[0];
        slow=nums[slow];
        fast=nums[nums[fast]];

        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        slow=nums[0];

        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;*/

        for(int num:nums){
            int idx=Math.abs(num)-1;
            if(nums[idx]<0){
                return Math.abs(num);
            }
            nums[idx]*=-1;
        }
        return -1;
    }
}
