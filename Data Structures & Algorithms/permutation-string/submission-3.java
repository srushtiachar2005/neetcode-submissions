class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();

        if(n>m){
            return false;
        }
        int[] freq1=new int[26];
        for(int i=0;i<n;i++){
            char c=s1.charAt(i);
            freq1[c-'a']++;
        }

        int[] freq2=new int[26];
        int i=0;
        int j=0;
        while(j<m){
            char c1=s2.charAt(j);
            freq2[c1-'a']++;
            if((j-i+1)>n){
                freq2[s2.charAt(i)-'a']--;
                i++;
            }
            if(Arrays.equals(freq1,freq2)){
                return true;
            }
            j++;
        }
        return false;
    }
}
