class Solution {
    int[] t=new int[1001];
    private int solve(String s, int n, int i){
        if(t[i]!=0){
            return t[i];
        }
        if(i==n){
            return t[i]= 1;
        }
        if(s.charAt(i)=='0'){
            return t[i]=0;
        }
        int result=solve(s,n,i+1);
        if(i<n-1){
            if(s.charAt(i)=='1' || (s.charAt(i)=='2' && s.charAt(i+1)<='6')){
               result+= solve(s,n,i+2);
            }
        }
        return t[i]=result;
    }
    public int numDecodings(String s) {
        int n=s.length();
        return solve(s,n,0);
    }
}
