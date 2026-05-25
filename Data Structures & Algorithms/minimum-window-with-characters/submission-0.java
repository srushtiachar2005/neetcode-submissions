class Solution {
    public String minWindow(String s, String t) {
        //Sliding Window
        int l=0,r=0;
        int n=s.length();
        int m=t.length();
        int[] freq=new int[256];
        for(int i=0;i<m;i++)
        {
            char c=t.charAt(i);
            freq[c]++;
        }
        int count=0;
        int minLen=Integer.MAX_VALUE;
        int startIdx=0;
        while(r<n)
        {
            char c1=s.charAt(r);
            if(freq[c1]>0)
            {
                count++;
            }
            freq[c1]--;

            while(count==m)
            {
                if((r-l+1)<minLen)
                {
                    minLen=r-l+1;
                    startIdx=l;
                }

                char leftChar=s.charAt(l);
                freq[leftChar]++;
                if(freq[leftChar]>0)
                {
                    count--;
                }
                l++;
            }
            r++;
        }

        return minLen == Integer.MAX_VALUE ? "" :s.substring(startIdx,startIdx+minLen);
    }
}
