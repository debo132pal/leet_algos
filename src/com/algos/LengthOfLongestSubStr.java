package com.algos;

import java.util.HashMap;

public class LengthOfLongestSubStr {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> charCount = new HashMap<>();
        int start = 0;
        int end = 0;
        int maxLength = 0;
        while ( end < s.length() ){
            char c = s.charAt(end);
            if( charCount.getOrDefault( c , 0 ) == 1 ){

                while(  s.charAt(start)  != c ){
                     charCount.put( s.charAt(start) , 0 );
                     start++;
                 }
                 start++;
            } else {
                charCount.put(c,1);
            }
            maxLength = Math.max( maxLength, ( end - start) + 1);
            end++;
        }
        return maxLength;

    }

    public static void main(String[] args) {
        LengthOfLongestSubStr  strL = new LengthOfLongestSubStr();
        System.out.println( strL.lengthOfLongestSubstring("tmmzuxt"));
        System.out.println( strL.lengthOfLongestSubstring("abcabcbb"));
        System.out.println( strL.lengthOfLongestSubstring("bbbbb"));
        System.out.println( strL.lengthOfLongestSubstring("pwwkew"));
        System.out.println( strL.lengthOfLongestSubstring(""));
    }
}
