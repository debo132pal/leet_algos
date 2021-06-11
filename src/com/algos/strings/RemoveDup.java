package com.algos.strings;

import java.util.LinkedList;
import java.util.Stack;

public class RemoveDup {

    class Node {
        char ch;
        int count;
        public Node(char c, int n) {
            ch =c;
            count = n;
        }
    }
    public String removeDuplicates(String s, int k) {
        LinkedList<Node> ts = new LinkedList<>();
        for ( int i = 0 ; i < s.length() ; i++  ){
            Node last = ts.peekLast();
            if( last != null && last.ch == s.charAt(i) ){
                last.count += 1;
                if( last.count >=  k ) ts.removeLast();
            } else {
                ts.addLast( new Node( s.charAt(i) , 1 ));
            }
        }
        StringBuilder builder = new StringBuilder();
        for( Node e : ts){
            for( int i = 0 ; i < e.count ; i++ ){
                builder.append(e.ch);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        RemoveDup dup = new RemoveDup();
        System.out.println( dup.removeDuplicates("pbbcggttciiippooaais", 2));
    }
}
