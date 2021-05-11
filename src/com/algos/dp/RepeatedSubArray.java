package com.algos.dp;

public class RepeatedSubArray {

    public int findLength(int[] nums1, int[] nums2) {
        int M = nums1.length;
        int N = nums2.length;
        int[][] result = new int[M+1][N+1];
        int max = 0;
        for( int i = 1 ; i <= M ; i++ ){
            for( int j = 1 ; j <= N ; j++ ){
                if( nums1[i-1] == nums2[j-1] ){
                  //  System.out.println( nums1[i-1]);
                    result[i][j] = result[i-1][j-1] + 1;

                    max = Math.max( result[i][j] , max );
                }

            }

        }
        return max;

    }

    public static void main(String[] args) {
        int[] nums1 = {0,0,0,0,0};
        int[] nums2 = {0,0,0,0,0};

        RepeatedSubArray sA = new RepeatedSubArray();
        System.out.println( sA.findLength( nums1 , nums2 ));
    }

}
