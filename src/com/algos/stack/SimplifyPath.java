package com.algos.stack;

import java.util.Deque;
import java.util.LinkedList;

public class SimplifyPath {

    public String simplifyPath(String path) {
        if( path == null || path.isEmpty() ) return  new String();
        String[] components = path.split("/");
        for( String s : components ){
            System.out.println( s   );
        }
        return null;
    }

    public static void main(String[] args) {
        SimplifyPath path = new SimplifyPath();
        path.simplifyPath( "/a/b/c/.././././//d");
    }
}
