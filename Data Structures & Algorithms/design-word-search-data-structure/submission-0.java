class TrieNode{
    TrieNode[] children=new TrieNode[26];
    boolean endOfWord=false;
}

class WordDictionary {
    private TrieNode root;
    public WordDictionary() {
        root=new TrieNode();
    }

    public void addWord(String word) {
        TrieNode cur=root;
        for(char c:word.toCharArray())
        {
            int i=c-'a';
            if(cur.children[i]==null){
                cur.children[i]=new TrieNode();
            }
            cur=cur.children[i];
        }
        cur.endOfWord=true;
    }
    public boolean searchUtil(String word,TrieNode root){
        TrieNode cur=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c=='.'){
                for(int j=0;j<26;j++){
                    if(cur.children[j]!=null){
                        if(searchUtil(word.substring(i + 1),cur.children[j]))
                        return true;
                    }
                }
                return false;
            }else if(cur.children[c-'a']==null){
                return false;
            }
            cur=cur.children[c-'a'];
        }
        return cur.endOfWord;
    }
    public boolean search(String word) {
        return searchUtil(word,root);
    }
}
