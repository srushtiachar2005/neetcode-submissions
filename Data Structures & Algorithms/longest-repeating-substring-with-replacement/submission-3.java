class Solution {
    public int characterReplacement(String s, int k) {
       /* int[] hash=new int[26];
        int l=0,r=0,maxfreq=0;
        int maxLen=0;
        int len=s.length();
        while(r<len)
        {
            char c=s.charAt(r);
            hash[c-'A']++;
            maxfreq=Math.max(maxfreq,hash[c-'A']);
            if(((r-l+1)-maxfreq)>k)
            {
                hash[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            
            r++;
        }
        return maxLen;*/

        int[] hash=new int[26];
        int r=0;
        int l=0;
        int n=s.length();
        int maxLen=0;
        int maxFreq=0;
        while(r<n){
            char c=s.charAt(r);
            hash[c-'A']++;
            maxFreq=Math.max(maxFreq,hash[c-'A']);
            if((r-l+1)-maxFreq>k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
