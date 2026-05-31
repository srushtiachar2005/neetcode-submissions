class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();

        StringBuilder s=new StringBuilder();
        solve(n,0,0,res,s);
        return res;
    }

    public void solve(int n,int openCount,int closeCount,List<String> res,StringBuilder s)
    {
        if(s.length()==2*n){
            res.add(s.toString());
            return;
        }

        if(openCount<n){
            s.append('(');
            solve(n,openCount+1,closeCount,res,s);
            s.deleteCharAt(s.length()-1);
        }

        if(closeCount<openCount){
            s.append(')');
            solve(n,openCount,closeCount+1,res,s);
            s.deleteCharAt(s.length()-1);
        }

    }
}
