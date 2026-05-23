class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
           /* Map<String,List<String>> res=new HashMap<>();
            for(String s:strs)
            {
                char[] charArray=s.toCharArray();
                Arrays.sort(charArray);
                String sorted=new String(charArray);
                res.putIfAbsent(sorted,new ArrayList<>());
                res.get(sorted).add(s);
            }       
            return new ArrayList<>(res.values());*/
            HashMap<String,List<String>> res=new HashMap<>();
            for(String s:strs)
            {
                int[] count=new int[26];
                for(char c:s.toCharArray())
                {
                    count[c-'a']++;
                }
                String key=Arrays.toString(count);
                res.putIfAbsent(key,new ArrayList<>());
                res.get(key).add(s);
            }
            return new ArrayList<>(res.values());
    }
}
 