class Solution {
    public int[] productExceptSelf(int[] nums) {
       /* int n=nums.length;
        int[] res=new int[n];
        int[] pref=new int[n];
        int[] suff=new int[n];

        pref[0]=1;
        suff[n-1]=1;
        for(int i=1;i<n;i++)
        {
            pref[i]=nums[i-1]*pref[i-1];
        }

        for(int i=n-2;i>=0;i--)
        {
            suff[i]=nums[i+1]*suff[i+1];

        for(int i=0;i<n;i++)
        {
            res[i]=pref[i]*suff[i];
        }
        return res;*/

        int zero=0;
        int prod=1;

        for(int n:nums){
            if(n!=0){
                prod*=n;
            }else if(n==0){
                zero++;
            }
        }

        if(zero>1){
            return new int[nums.length];
        }

        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zero==1){
                res[i]=nums[i]==0?prod:0;
            }
            else{
                res[i]=prod/nums[i];
            }
        }
        return res;
    }
}