class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res=new StringBuilder();

      /*  int i=0;
        int j=0;

        while(i<word1.length() && j<word2.length()){
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }
        res.append(word1.substring(i));
        res.append(word2.substring(j));

        return res.toString();*/

        int n=word1.length();
        int m=word2.length();

        int i=0,j=0;
        while(i<n || j<m){
            if(i<n) res.append(word1.charAt(i++));
            if(j<m) res.append(word2.charAt(j++));
        }
        return res.toString();
    }
}