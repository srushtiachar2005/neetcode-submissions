class Solution {
    public Map<Character,String> map=new HashMap<>();
    public Solution(){map.put('2',"abc");
    map.put('3',"def");
    map.put('4',"ghi");
    map.put('5',"jkl");
    map.put('6',"mno");
    map.put('7',"pqrs");
    map.put('8',"tuv");
    map.put('9',"wxyz");
    }
    public void solve(int idx,String digits,List<String> res,StringBuilder s){
        if(idx==digits.length()){
            res.add(s.toString());
            return;
        }
        char ch=digits.charAt(idx);
        String q=map.get(ch);
        for(int i=0;i<q.length();i++){
            s.append(q.charAt(i));
            solve(idx+1,digits,res,s);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
         List<String> res=new ArrayList<>();
         
         if(digits.length() == 0)
            return res;
        StringBuilder s=new StringBuilder();
        solve(0,digits,res,s);
        return res;
    }
}
