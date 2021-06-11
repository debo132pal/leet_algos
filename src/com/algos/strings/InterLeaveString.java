package com.algos.strings;

public class InterLeaveString {
    public boolean isInterleave(String s1, String s2, String s3) {

        if( s3.length() != s1.length() + s2.length() ){
            return false;
        }

        boolean[][] result = new boolean[s1.length() + 1][s2.length() + 1];
        for( int i = 0 ; i <= s1.length() ; i++ ){
            for( int j = 0 ; j <= s2.length() ; j++ ){
               if( i == 0 && j == 0 ) {
                   result[i][j] = true;
               } else {
                  char ch = s3.charAt( i + j - 1 );
                   if( j > 0 && result[i][j-1] && ch == s2.charAt(j-1)) {
                       result[i][j] = result[i][j-1];
                   } else if( i > 0 && result[i-1][j] && ch == s1.charAt(i-1)) {
                       result[i][j] = result[i-1][j];
                   }

               }

            }

        }
        return result[s1.length()][s2.length()];


    }

    public static void main(String[] args) {

        String s = "";
        String t = "";
        InterLeaveString is = new InterLeaveString();
        System.out.println( is.isInterleave( s, t , ""));


    }
}
