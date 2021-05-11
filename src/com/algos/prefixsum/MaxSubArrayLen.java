package com.algos.prefixsum;

import java.util.HashMap;

public class MaxSubArrayLen {
    public int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        int S = 0;
        int max = 0;
        for( int i = 0 ; i < nums.length ; i++ ){
            S += nums[i];
            if( S == k ){
                max = i + 1;
            } else if ( prefixSum.containsKey( S - k ) ){
                 max = Math.max( max , ( i - prefixSum.get( S - k) ) );
            }

            prefixSum.put( S, i );
        }
        return max;
    }

    public static void main(String[] args) {
        int[] x = { -2 , -1 , 2 , 1};
        MaxSubArrayLen l = new MaxSubArrayLen();
        System.out.println( l.maxSubArrayLen( x , 1 ) );
    }
}
