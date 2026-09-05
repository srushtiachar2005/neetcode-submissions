class Solution {
    public int subSet(int[] nums,int i,int xor){
        if(i==nums.length){
            return xor;
        }

        //Include the number
        int include=subSet(nums,i+1,xor^nums[i]);

        //Exclude the number

        int exclude=subSet(nums,i+1,xor);

        return include+exclude;
    }
    public int subsetXORSum(int[] nums) {
        return subSet(nums,0,0);
        
    }
}