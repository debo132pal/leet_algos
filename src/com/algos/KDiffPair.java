package com.algos;

import java.util.HashMap;

public class KDiffPair {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int n : nums ){
            map.put( n , map.getOrDefault(n, 0 ) + 1 );
        }
        int count = 0;
        for ( Integer n : map.keySet()){
            if( k == 0 ){
                int v = map.get(n);
                if( v > 1) count++;
            } else {
                if( map.containsKey(n + k ))
                    count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] num1 = { 3,1,4,1,5 };
        KDiffPair pair = new KDiffPair();
        System.out.println( pair.findPairs( num1, 2 ));

        int[] num2 = { 1,2,3,4,5 };
        System.out.println( pair.findPairs( num2, 1 ));
    }
}
