class Solution {
    boolean[][] memo=new boolean[1001][1001];
    private boolean solve(String s, int i , int j){
        if(i>=j)
        {
            return memo[i][j]=true;
        }
        if(memo[i][j]!=false){
            return memo[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            return memo[i][j]=solve(s,i+1,j-1);
        }
        return memo[i][j]=false;
    }
    public int countSubstrings(String s) {
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(solve(s,i,j)==true){
                    count++;
                }
            }
        }
        return count;
    }
}
