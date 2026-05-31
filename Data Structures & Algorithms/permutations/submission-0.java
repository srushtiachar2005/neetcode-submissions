class Solution {
    public void solve(int[] nums,List<List<Integer>> res,List<Integer> temp,boolean[] freq){

        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i]){
                freq[i]=true;
                temp.add(nums[i]);
                solve(nums,res,temp,freq);
                temp.remove(temp.size()-1);
                freq[i]=false;
            }
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();

        boolean[] freq=new boolean[nums.length];
        solve(nums,res,temp,freq);
        return res;
    }
}
