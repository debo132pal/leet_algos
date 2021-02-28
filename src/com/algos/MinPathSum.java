package com.algos;

public class MinPathSum {
    public int minPathSum(int[][] grid) {

        int R = grid.length;
        int C = grid[0].length;

        for( int i = 0 ; i < R ; i++ ){
            for( int  j = 0 ; j < C ; j++ ) {

               int top   =  j - 1 >= 0 ? grid[i][j-1] : 0 ;
               int left  =  i - 1 >= 0 ? grid[i-1][j] : 0;
               if( top > 0 && left > 0 )
                    grid[i][j] += Math.min( top, left) ;
               else if ( top > 0 ) {
                   grid[i][j] += top;
               } else if ( left > 0 ){
                   grid[i][j] += left;
               }
            }
        }
        return grid[R-1][C-1];
    }

    public static void main(String[] args) {
        int[][] a =
                { {1,3,1}, {1,5,1},{4,2,1}};
        MinPathSum p = new MinPathSum();
        System.out.println( p.minPathSum(a));
    }
}
