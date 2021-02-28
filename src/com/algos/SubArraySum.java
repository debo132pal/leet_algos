package com.algos;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

    public int subarraySum(int[] nums, int k) {
        int S = 0;
        int result = 0;
        Map<Integer,Integer> counts = new HashMap<>();
        counts.put(0,1);
        for( int n : nums ){
            S += n;
            result += counts.getOrDefault( S-k , 0 );
            counts.put( S , counts.getOrDefault(S,0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = { 1 , 2  ,3 };
        SubArraySum su = new SubArraySum();
        System.out.println( su.subarraySum( nums , 3 ));

        int[] nums2 = { 1 , 1, 1};

        System.out.println( su.subarraySum( nums2 , 2 ));
    }
}
