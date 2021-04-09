package com.algos.bst;

public class FindMin {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while( nums[lo] > nums[hi] ){
            int mid = lo + ( hi -lo ) / 2;
            if( nums[mid] > nums[lo] ){
                lo = mid + 1;
            } else{
                hi = mid;
            }
        }
        return nums[lo];
    }


    public static void main(String[] args) {


    }

}
