class Solution {
    public int characterReplacement(String s, int k) {
        int max=0;
        int l=0;
        int r=0;
        int n=s.length();
        int[] hash=new int[256];
        int maxFreq=0;
        while(r<n){
            char c=s.charAt(r);
            hash[c]++;
            maxFreq=Math.max(maxFreq,hash[c]);
            while((r-l+1)-maxFreq>k){
                hash[s.charAt(l)]--;
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
