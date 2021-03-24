package com.algos;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = { -1 , -1 };
        int lo = 0;
        int hi = nums.length - 1;

        while ( lo < hi ){
            int mid = lo + ( hi - lo) / 2;
            if( nums[mid] >= target ){
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        result[0] = lo;

        if( lo >= 0 ) {
            hi = nums.length - 1;
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
                if( nums[mid] > target ){
                    hi = mid;
                }else {
                    lo = mid + 1;
                }
            }
        }

        result[1] = lo - 1;

        return result;
    }

    public static void main(String[] args) {
        int[] nums =  {5,7,7,8,8,10};
        SearchRange range = new SearchRange();
        int[] r = range.searchRange( nums,8);
        System.out.println( r[0] + " " + r[1] );
    }
}
