package com.algos;

import java.util.LinkedList;
import java.util.List;

public class LetterComb {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        char[][] numPad =  {
                {},
                {},
                {'a','b','c'},
                {'d','e','f'},
                {'g','h','i'},
                {'j','k','l'},
                {'m','n','o'},
                {'p','q','r','s'},
                {'t','u','v'},
                {'x','y','z'}
        };

        for( int i = 0 ; i < digits.length() ; i++ ){
            char ch = digits.charAt(i);
            int digit= ch - '0';
            char[] maps = numPad[digit];
            if( result.isEmpty()){
                for( char c : maps){
                    result.add( c + "");
                }
            } else {
                    int length = result.size();
                    for( int id = 0 ; id < length ; id++ ){
                        String str= result.removeFirst();
                        for (char c : maps) {
                            result.addLast( str + c );
                        }
                    }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        LetterComb comb = new LetterComb();
        System.out.println( comb.letterCombinations( "245") );

    }


}
