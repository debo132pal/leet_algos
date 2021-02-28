package com.algos;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = { -1 , -1 };
        Map<Integer,Integer> sums = new HashMap<>();
        for( int i = 0 ; i < nums.length ; i++ ){
            int remaining = target - nums[i];
            if( sums.containsKey(remaining)){
                result[0] = i;
                result[1] = sums.get(remaining);
                return result;
            }
            sums.put( nums[i] , i );
        }
        return result;
    }


}
