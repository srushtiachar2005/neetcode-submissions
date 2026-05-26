class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='('|| ch=='['||ch=='{')
            {
                stack.push(ch);
            }
             else {
                // No opening bracket available
                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching
                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')) {
                    return false;
                }
        }
        }
        return stack.isEmpty();
        
    }
}
