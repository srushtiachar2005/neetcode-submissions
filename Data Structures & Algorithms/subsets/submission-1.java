class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
       /* int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();

        for(int i=0;i<(1<<n);i++){
            List<Integer> subset=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    subset.add(nums[j]);
                }
            }
            res.add(subset);
        }
        return res;*/
        List<List<Integer>> res=new ArrayList<>();

        solve(nums,0,new ArrayList<>(),res);
        return res;
    }

    public void solve(int[] nums,int idx,List<Integer> temp,List<List<Integer>> res)
    {
       
        if(idx == nums.length){
    res.add(new ArrayList<>(temp));
    return;
}
        temp.add(nums[idx]);
        solve(nums,idx+1,temp,res);
        temp.remove(temp.size()-1);
        solve(nums,idx+1,temp,res);
    }
}
