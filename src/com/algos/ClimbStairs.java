package com.algos;

public class ClimbStairs {

    public int climbStairs(int n) {
        int[] result = new int[n+1];
        result[0] = 1;
        result[1] = 1;
        for( int i = 2 ; i <= n ; i++ ){
            result[i] = result[i-2] + result[i-1];
        }
        return result[n];
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        System.out.println(  climbStairs.climbStairs( 2 ));
        System.out.println(  climbStairs.climbStairs( 3));
        System.out.println(  climbStairs.climbStairs( 4 ));
        System.out.println(  climbStairs.climbStairs( 4 ));
    }
}
