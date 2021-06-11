package com.algos.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> ids = new TreeSet<>();
        for( int n : nums ){
            ids.add( n);
        }
        int maxV  = 0;
        int currV = 0;
        for ( int t : ids.descendingSet()  ){
            if( ids.contains( t + 1) ){
                currV++;
            } else {
                currV = 1;
            }
            maxV = Math.max( currV, maxV);
        }
       return maxV ;
    }

    public static void main(String[] args) {
        int[] n = {9,1,4,7,3,-1,0,5,8,-1,6};
        LongestConsecutive lc = new LongestConsecutive();
        System.out.println( lc.longestConsecutive( n ));
    }
}
