class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int[] hash=new int[256];

        int l=0;
        int r=0;
        int n=s.length();
        while(r<n){
            char c=s.charAt(r);
            hash[c]++;
            while(hash[c]>1){
                hash[s.charAt(l)]--;
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
