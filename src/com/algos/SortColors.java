package com.algos;

public class SortColors {
    public void sortColors(int[] nums) {

        int i = 0 ,  lt = 0 , gt = nums.length - 1;
        int pivot = 1;
        while( i <= gt ){
            if( nums[lt] < 1){
                lt++;
                i++;
            } else if ( nums[gt] > 1 ){
                gt--;
            } else if ( nums[i] == 2 ){
                swap( i , gt, nums);
            }  else if ( nums[i] == 0 ) {
                swap( lt , i , nums  );
            } else {
                i++;
            }

        }

    }

    private void swap(int lt, int gt, int[] nums) {
        int t = nums[lt];
        nums[lt] = nums[gt];
        nums[gt] = t;
    }

    public  static void print( int[] nums ){
        for( int i : nums ){
            System.out.print( i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 2,0,2,1,1,0 };
        print( nums );
        SortColors colors = new SortColors();
        colors.sortColors(nums);
        print( nums);

        int[] nums1 = { 2,0,1};
        print( nums1 );
        colors.sortColors(nums1);
        print( nums1);

        int[] nums2 = { 2};
        print( nums2 );
        colors.sortColors(nums2);
        print( nums2);

        int[] nums3 = { 1,2,0,2,1,1,0};
        print( nums3 );
        colors.sortColors(nums3);
        print( nums3);
    }
}
