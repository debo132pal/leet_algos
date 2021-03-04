package com.algos;

public class DecodeWays {

    public int numDecodings(String s) {
        int len = s.length();
        int[] result = new int[len+1];
        result[len] = 1;
        char prev = Character.MIN_VALUE;
        for( int i = len -1 ; i>= 0 ; i-- ){
            char curr = s.charAt(i);
            if( curr >= '1' && curr <='9' ){
                result[i] = result[i+1];
                if( prev >= '0' && prev <= '9') {
                    int n = 10 * ( curr - '0' ) + ( prev - '0' );
                    if( n >= 10 && n <= 26 ){
                        result[i] += result[i+2];
                    }
                }

            }
            prev = curr;
        }
        return result[0];
    }

    public static void main(String[] args) {
        DecodeWays ways = new DecodeWays();
        System.out.println( ways.numDecodings("12"));

    }

}
