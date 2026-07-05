class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String[] paths=path.split("/");

        for(String cur:paths){
            if(cur.equals("..")){
                if(!stack.isEmpty())stack.pop();
            }else if(!cur.equals("") && !cur.equals(".")){
                stack.push(cur);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        /*return "/"+String.join("/",stack);*/
        StringBuilder res=new StringBuilder();
        for(String s:stack){
            res.append("/").append(s);
        }
        return res.toString();
    }
}