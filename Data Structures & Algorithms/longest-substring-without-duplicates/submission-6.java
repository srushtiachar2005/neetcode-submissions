class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int[] freq=new int[128];
        int n=s.length();
        int max=0;
        while(r<n){
            char c=s.charAt(r);
            freq[c]++;
            while(freq[c]>1){
                freq[s.charAt(l)]--;
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
