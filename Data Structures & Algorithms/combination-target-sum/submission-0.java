class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(nums,target,0,temp,res);
        return res;
    }
    public void solve(int[] nums,int target, int idx,List<Integer> temp, List<List<Integer>> res)
    {
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        if (idx == nums.length) {
            return;
        }

        if(nums[idx]<=target){
            temp.add(nums[idx]);
            solve(nums,target-nums[idx],idx,temp,res);
            temp.remove(temp.size()-1);
        }
        solve(nums,target,idx+1,temp,res);
    }
}
