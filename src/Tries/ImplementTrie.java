package Tries;

public class ImplementTrie {
	class TrieNode{
		private TrieNode children[];
		private int alphabetSize;
		private boolean isEnd;
		public TrieNode(){
			alphabetSize = 26;
			children = new TrieNode[alphabetSize];
		}
		
		public boolean containsKey(char c) {
			return children[c-'a'] != null;
		}		
		public TrieNode get(char c) {
			return children[c-'a'];
		}
		public void put(char c, TrieNode node) {
			children[c-'a'] = node;
		}
		public void setEnd() {
			isEnd = true;
		}
		public boolean isEnd() {
			return isEnd;
		}
	}
	TrieNode root;
	/** Initialize your data structure here. */
    public ImplementTrie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) { 
        TrieNode node = root;
        for(char c : word.toCharArray()) {
        	if(!node.containsKey(c))
        		node.put(c, new TrieNode());
        	node = node.get(c);
        }
        node.setEnd();
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
    	TrieNode node = root;
    	for(char c : word.toCharArray()) {
    		if(node.containsKey(c))
    			node = node.get(c);
    		else
    			return false;
    	}
    	return node != null && node.isEnd();
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    	TrieNode node = root;
    	for(char c : prefix.toCharArray()) {
    		if(!node.containsKey(c))
    			return false;
    	}
        return true;
    }
}
