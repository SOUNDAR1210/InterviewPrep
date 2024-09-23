package Trie_DS;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public Map<Character,TrieNode> children;
    public  boolean isEndOfWord;
    TrieNode(){
        children = new HashMap<>();
        isEndOfWord = false;
    }
}
