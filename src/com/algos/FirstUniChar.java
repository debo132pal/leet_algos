package com.algos;

import java.util.HashMap;
import java.util.Map;

public class FirstUniChar {
    public int firstUniqChar(String s) {
        Map<Character,Integer> countChar = new HashMap<>();
        for( int i = 0 ; i < s.length() ; i++ ){
            char c = s.charAt(i);
            countChar.put(c, countChar.getOrDefault(c,0) + 1);
        }
        for( int i = 0 ; i < s.length() ; i++ ){
            char c = s.charAt(i);
            if( countChar.get(c) == 1)
                return i;
        }
        return -1;
    }
}
