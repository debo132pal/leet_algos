package com.algos;

public class CountSubStrings {
    public int countSubstrings(String s) {
        if( s == null || s.length() == 0 )
            return 0;
        int len = s.length();
        int[][] res = new int[len][len];
        int count = s.length();
        for( int i = 0 ; i < len ; i++ ) {
            res[i][i] = 1;
        }

        for( int i = 1 ; i < len ; i++){
            for( int j = i-1 ; j >= 0 ; j-- ) {
                if( s.charAt(j) == s.charAt(i) ){
                    if ( res[i-1][j+1] == 1 || (i-j == 1)){
                        res[i][j] = 1;
                        count++;
                    }

                }

            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "aaa";
        CountSubStrings strs = new CountSubStrings();
        System.out.println( strs.countSubstrings( s) );
        System.out.println( strs.countSubstrings( "abc") );
    }
}
