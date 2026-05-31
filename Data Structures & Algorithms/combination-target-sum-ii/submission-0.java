class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(candidates);
        solve(0,candidates,target,temp,res);
        return res;
    }

    public void solve(int idx,int[] nums,int target,List<Integer> temp, List<List<Integer>> res)
    {
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=idx;i<nums.length;i++)
        {
            if(i>idx && nums[i]==nums[i-1])
                continue;
            if(nums[i]>target) 
                break;
            temp.add(nums[i]);
            solve(i+1,nums,target-nums[i],temp,res);
            temp.remove(temp.size()-1);
        }
    }
}
