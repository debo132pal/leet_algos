package com.algos;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length;

        while ( lo < hi ){
            int mid = lo + ( hi - lo )/ 2;
            if( nums[mid] >= target ){
                hi = mid;
            } else {
                lo = mid  + 1;
            }

        }
        return lo;

    }

    public static void main(String[] args) {
        SearchInsertPosition st = new SearchInsertPosition();
        int[]  p = { 1 , 3 , 5 , 6 };
        System.out.println( st.searchInsert( p , 5 ));
        System.out.println( st.searchInsert( p , 2 ));
        System.out.println( st.searchInsert( p , 7 ));
        System.out.println( st.searchInsert( p , 0 ));
        int[] x = { 1 };
        System.out.println( st.searchInsert( x , 0 ));
    }
}
