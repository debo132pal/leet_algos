package com.algos;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
         int  hi = nums.length - 1;
         int  lo = 1;
         while ( lo < hi ){
             int mid = lo + ( hi - lo )/2 ;
             if( onLeft( mid , nums ) ){
                 hi = mid;
             } else {
                 lo = mid + 1;
             }
         }
         return lo;
    }

    private boolean onLeft(int mid , int[] nums ) {
        int count = 0;
        for ( int i = 0 ; i < nums.length ; i++ ){
            if( nums[i] <= mid )
                count++;
        }
        if( count > mid )
            return true;
        return false;

    }

    public static void main(String[] args) {
        FindDuplicate dup = new FindDuplicate();
        int[] num = {1,3,4,6,2,5,1};
        System.out.println( dup.findDuplicate( num) );
        int[] n1 = { 1,3,4,2,2};
        System.out.println( dup.findDuplicate( n1) );
        int[] n2 = { 3,1,3,4,2};
        System.out.println( dup.findDuplicate( n2) );
        int[] n3 = { 1,1,2};
        System.out.println( dup.findDuplicate( n3) );

    }

}
