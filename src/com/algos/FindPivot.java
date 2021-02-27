package com.algos;

public class FindPivot {

    public int pivotIndex(int[] nums) {
        int pivot = -1;
        int S = 0;
        for( int n : nums ){
            S += n;
        }

        int leftSum = 0;
        int rightSum = S;
        for( int i = 0 ; i < nums.length ; i++ ){
            rightSum -= nums[i];
            if( rightSum == leftSum )
                return i;
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        FindPivot pivot = new FindPivot();
        System.out.println( pivot.pivotIndex( nums ));
        int[] nums1 = {1,2,3};
        System.out.println( pivot.pivotIndex( nums1 ));
        int[] nums2 = {2,1,-1};
        System.out.println( pivot.pivotIndex( nums2 ));
        int[] nums3 = {1,-1,2};
        System.out.println( pivot.pivotIndex( nums3 ));

    }
}
