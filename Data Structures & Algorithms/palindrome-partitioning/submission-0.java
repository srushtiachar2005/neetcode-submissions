class Solution {
    List<List<String>> res=new ArrayList<>();
    List<String> ans=new ArrayList<>();
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> ans=new ArrayList<>();
        dfs(0,s,res,ans);
        return res;
    }

    private void dfs(int i,String s,List<List<String>> res,List<String> ans){
        if(i>=s.length()){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int j=i;j<s.length();j++){
            if(isPalindrome(s,i,j)){
                ans.add(s.substring(i,j+1));
                dfs(j+1,s,res,ans);
                ans.remove(ans.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s, int l ,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
