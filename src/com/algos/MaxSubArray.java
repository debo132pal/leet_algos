package com.algos;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int curr_max = nums[0];
        for( int i = 1 ; i < nums.length ; i++ ){
            curr_max = Math.max( curr_max + nums[i] , nums[i] );
            max = Math.max( curr_max , max );
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray subArray = new MaxSubArray();
        System.out.println( subArray.maxSubArray(nums));
    }
}
