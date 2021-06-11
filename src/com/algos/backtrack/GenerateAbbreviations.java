package com.algos.backtrack;

import java.util.LinkedList;
import java.util.List;

public class GenerateAbbreviations {
    public List<String> generateAbbreviations(String word) {

        List<String> result = new LinkedList<>();
        helper(  -1 , 0 , result , word );
        return result;

    }

    private void helper(int prefix, int pos, List<String> result, String word) {
        if( pos == word.length()  ){
            return;
        } else {
            if (prefix == -1) {
                result.add(word);
                helper(0, 0, result, word);
            }  else {
                char ch = word.charAt(pos);
                int count   =  1  + prefix;
                String st1  = count + word.substring(pos + 1);
                result.add( st1 );
                System.out.println( st1);

                String start = word.substring( 0 , prefix );
                int len = word.length() - prefix;
                String w = start + len;
                System.out.println(w);
                result.add(w);
                System.out.println();
              //  helper( count ,  , result , st1 );
                helper( count , pos + 1 , result , word );

            }


        }
    }

    public static void main(String[] args) {
        String w = "word";
        GenerateAbbreviations abbreviations = new GenerateAbbreviations();
        System.out.println( abbreviations.generateAbbreviations( w));
    }
}
