package com.algos.dp;

public class LCS {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text2.length() + 1][text1.length() + 1];
        for( int i = text2.length()-1; i >= 0 ; i-- ){
            for(int j = text1.length() -1 ; j >= 0 ; j-- ){
                if( text2.charAt(i) == text1.charAt(j)){
                    dp[i][j] = dp[i+1][j+1] + 1;
                } else {
                    dp[i][j] = Math.max( dp[i+1][j] , dp[i][j+1]);
                }
            }

        }
        return dp[0][0];

    }

    public int lcs(String text1, String text2) {
    /*    int[] dp = new int[text1.length() + 1];
        for( int i = text2.length()-1; i >= 0 ; i-- ){
            for(int j = text1.length() -1 ; j >= 0 ; j-- ){
                if( text2.charAt(i) == text1.charAt(j)){
                    dp[i][j] = dp[i+1][j+1] + 1;
                } else {
                    dp[i][j] = Math.max( dp[i+1][j] , dp[i][j+1]);
                }
            }

        }
        return dp[0][0];
*/
        return 0;
    }

    public static void main(String[] args) {
        String text1 = "aaa";
        String text2 = "ab";
        LCS lcs = new LCS();
        System.out.println( lcs.longestCommonSubsequence( text1 , text2));
    }


}
