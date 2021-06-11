package com.algos.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MaxStringLength {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        Map<String,Integer> count = new HashMap<>();
        int max = 0;
        for( String w : words ){
            int maxLen = 1;
            for( int i = 0 ; i < w.length() ; i++ ){
                String t = w.substring(0,i) + w.substring(i+1);
                if( count.containsKey( t )){
                    int len = count.get(t) + 1;
                    maxLen = Math.max( maxLen , len  );
                }
            }
            count.put( w , maxLen);
            max = Math.max( maxLen , max);
        }
        return max ;
    }

    public static void main(String[] args) {
        String[] str = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
        MaxStringLength sLen = new MaxStringLength();
        System.out.println( sLen.longestStrChain( str ));
        String[] str1 = {"a","b","ba","bca","bda","bdca"};
        System.out.println( sLen.longestStrChain( str1 ));
    }
}
