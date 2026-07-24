class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int count=0;
                while(set.contains(nums[i]+count)){
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
