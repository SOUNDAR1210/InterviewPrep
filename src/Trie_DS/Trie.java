package Trie_DS;

public class Trie {
    private TrieNode root;

    public Trie(){
        this.root = new TrieNode();
    }

    public void insert(String word){
        TrieNode current = root;
        for(Character c : word.toCharArray()){
            TrieNode node = current.children.get(c);
            if(node==null){
                node = new TrieNode();
                current.children.put(c,node);
            }
            current = node;
        }
        current.isEndOfWord = true;
        System.out.println("The word "+word+" Successfully inserted at the Trie.");
    }

    public boolean search(String word){
        TrieNode current = root;
        for(Character c:word.toCharArray()){
            TrieNode node = current.children.get(c);
            if(node==null) {
                System.out.println("The word is not present in the trie!");
                return false;
            }
            current = node;
        }
        if(current.isEndOfWord){
            System.out.println("The word is present in the Trie.");
            return true;
        }else {
            System.out.println("The word is present in the Trie and is a prefix of a another word.");
            return false;
        }
    }
}
