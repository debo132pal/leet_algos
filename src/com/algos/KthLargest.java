package com.algos;

public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        int lo = Integer.MAX_VALUE;
        int hi = Integer.MIN_VALUE;
        for (int i : nums) {
            lo = Math.min(i, lo);
            hi = Math.max(i, hi);
        }
         int t = nums.length - k;
        while( lo < hi ){
            int mid = lo + ( hi - lo)/2;
             if( count( nums, mid ,t)){
                hi = mid;
             } else {
                lo = mid + 1;
             }
        }

        return lo;
    }

    private boolean count(int[] nums, int mid, int k) {

        int count = 0;
        for ( int i : nums ){
            if( i <= mid ){
                count++;
            }
        }
        if( count  > k )
            return true;
        return false;

    }

    public static void main(String[] args) {
        int[] nums = { 3,2,1,5,6,4};
        KthLargest kth = new KthLargest();
        System.out.println( kth.findKthLargest(nums,2));
        System.out.println("");
        int[] nums1 = { 3,2,3,1,2,4,5,5,6};
        for( int i = 1; i <= nums1.length ; i++)
            System.out.println( kth.findKthLargest( nums1,i));
    }
}
