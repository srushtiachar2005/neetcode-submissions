class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder res=new StringBuilder();

        int m=word1.length();
        int n=word2.length();
        int i=0,j=0;
        while(i<m && j<n){
            res.append(word1.charAt(i++)).append(word2.charAt(j++));
        }

        while(i<m){
            res.append(word1.charAt(i++));
        }
        while(j<n){
            res.append(word2.charAt(j++));
        }

        return res.toString();
        
    }
}