package com.algos;

public class MinPathSum {
    public int minPathSum(int[][] grid) {

        int R = grid.length;
        int C = grid[0].length;

         for( int i = 0 ; i < R ; i++ ){
             for( int j = 0 ; j < C ; j++ ){
                 if( i == 0 && j == 0 ){
                    // do nothing
                 } else if ( i == 0 ){
                     grid[i][j] += grid[i][j-1];
                 } else if ( j == 0 ){
                     grid[i][j] += grid[i-1][j];
                 } else
                    grid[i][j] += Math.min( grid[i-1][j] , grid[i][j-1] );
             }
         }

        return grid[R-1][C-1];
    }

    public static void main(String[] args) {
        int[][] a =
                { {1,3,1},
                  {1,5,1},{4,2,1}};
        MinPathSum p = new MinPathSum();
        System.out.println( p.minPathSum(a));
    }
}
