class Solution {
    public int longestConsecutive(int[] nums) {
       /* if(nums.length==0)
        {
            return 0;
        }
        int ans=1;
        int count=1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if(nums[i]==nums[i-1]+1)
            {
                count++;
            }else{
                count=1;
            }
            ans=Math.max(ans,count);
        }
        return ans;

         if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        int ans=1;
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int currNum=num;
                int count=1;
                while(set.contains(currNum+1))
                {
                    currNum++;
                    count++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;*/

        Map<Integer,Integer> map=new HashMap<>();
        int res=0;

        for(int num:nums)
        {
            if(!map.containsKey(num))
            {
                map.put(num,map.getOrDefault(num-1,0)+map.getOrDefault(num+1,0)+1);
                map.put(num-map.getOrDefault(num-1,0),map.get(num));
                map.put(num+map.getOrDefault(num+1,0),map.get(num));
                res=Math.max(res,map.get(num));
            }
        }
        return res;
    }
}
