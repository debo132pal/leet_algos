package com.algos;

public class ReverseString {
    public void reverseString(char[] s) {
        int lo = 0;
        int hi = s.length - 1;
        while ( lo < hi ){
            swap( lo , hi , s);
            lo++;
            hi--;
        }

    }
    public void swap( int lo , int hi , char[] s ){
        char t = s[lo];
        s[lo]  = s[hi];
        s[hi]  = t;
    }
}
