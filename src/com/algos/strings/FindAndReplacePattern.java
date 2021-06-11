package com.algos.strings;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindAndReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result  = new LinkedList<>();
        if( pattern.length() == 1){
            result = Arrays.asList( words) ;
        } else {
            LinkedList<Integer> patternCount= new  LinkedList<>();
            patternCount.addLast(1);
            for( int i = 1; i < pattern.length() ; i++ ){
                if( pattern.charAt(i) == pattern.charAt(i-1)){
                    int c = patternCount.removeLast();
                    patternCount.addLast( c + 1);
                } else {
                    patternCount.addLast( 1 );
                }
            }
            for( String w : words ){
                boolean canAdd = false;
                LinkedList<Integer> wCount= new  LinkedList<>();
                if( canAdd )   result.add(w);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        String[] w = {"abc","deq","mee","aqq","dkd","ccc"};
        FindAndReplacePattern pattern = new FindAndReplacePattern();
        System.out.println( pattern.findAndReplacePattern( w , "abb"));
    }
}
