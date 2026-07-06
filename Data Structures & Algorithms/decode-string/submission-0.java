class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack=new Stack<>();
        Stack<String> stringStack=new Stack<>();
        StringBuilder res=new StringBuilder();
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }else if(ch=='['){
                numStack.push(num);
                stringStack.push(res.toString());
                num=0;
                res=new StringBuilder();
            }else if(Character.isLetter(ch)){
                res.append(ch);
            }else if(ch==']'){
                int repeat=numStack.pop();
                String prev=stringStack.pop();
                StringBuilder temp=new StringBuilder(prev);
                for(int j=0;j<repeat;j++){
                    temp.append(res);
                }
                res=temp;
            }
        }

        return res.toString();
    }
}