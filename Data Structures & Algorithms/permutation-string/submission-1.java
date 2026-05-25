class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        char[] c=s1.toCharArray();
        Arrays.sort(c);


        for(int i=0;i<=m-n;i++)
        {
            String s=s2.substring(i,i+n);
            char[] c1=s.toCharArray();
            Arrays.sort(c1);
            if(Arrays.equals(c,c1))
            {
                return true;
            }
        }
        return false;
    }
}
