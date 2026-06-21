class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int l=0;
        int r=0;
        int[] arr=new int[128];
        while(r<s.length())
        {
            char c=s.charAt(r);
            arr[c]++;
            while(arr[c]>1)
            {
            
                arr[s.charAt(l)]--;
                l++;
            }
            max=Math.max(max,r-l+1);
            
            r++;
        }
        return max;
    }
}
