package com.algos;

class Trie {

    private class Node {
        boolean isVal;
        Node[] next = new Node[26];
    }

    private Node head;
    /** Initialize your data structure here. */
    public Trie() {
      //  head = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {

        head = insert( head , 0 , word);
    }

    private Node insert(Node n, int d, String word) {
        if( n == null ){
            n = new Node();
        }
        if ( d == word.length() ){
            n.isVal = true;
        } else {
            char ch = word.charAt( d );
            n.next[ ch - 'a'] = insert( n.next[ ch - 'a'] , d + 1 , word );
        }
        return n;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return search( head , word , 0 );
    }

    private boolean search(Node n, String word, int d) {
        if( n == null )
            return false;
        if( d == word.length() ){
            return n.isVal;
        }
        char ch = word.charAt( d  );
        return search( n.next[ ch - 'a'] , word , d + 1);

    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return startsWith( head , prefix , 0 );
    }

    private boolean startsWith(Node n, String prefix, int d) {
        if( n == null )
            return false;
        if( d == prefix.length() ){
            return true;
        }
        char ch = prefix.charAt( d );
        return startsWith( n.next[ ch - 'a'] , prefix , d + 1);
    }


    public static void main(String[] args) {
        Trie trie = new Trie();
       /* trie.insert("apple");
        System.out.println( trie.search("apple") );   // return True
        System.out.println( trie.search("app") );   */  // return False
        System.out.println( trie.startsWith("a") ); // return True
        trie.insert("app");
        System.out.println( trie.search("app") );
    }

}
