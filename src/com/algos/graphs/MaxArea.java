package com.algos.graphs;

public class MaxArea {
    public int maxAreaOfIsland(int[][] grid) {
        int[][]  d  = { {-1,0} , { 1,0} , { 0 , -1} , {0, 1} };
        int max = 0 ;
        for( int i = 0 ; i <  grid.length ; i++ ) {
            for ( int j = 0 ; j < grid[0].length ; j++ ){
                if (  grid[i][j] == 1 ) {
                    int val = dfs(  grid , i , j , d  );
                    max = Math.max( val, max );
                  }
           }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j, int[][] d) {
        if( i < 0 || i >= grid.length ) return 0;
        if( j < 0 || j >= grid[0].length ) return 0;
        if( grid[i][j] == 0  ) return 0;
        grid[i][j] = 0;
        int count = 1;
        for ( int l =  0 ; l < 4 ; l++ ){
            int x = i + d[l][0];
            int y = j + d[l][1];
            int c = dfs(grid, x, y, d);
            count += c;
        }
        return count;
    }

    public static void main(String[] args) {
       int[][] grid =
                {       {0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0} };

    //

        MaxArea area = new MaxArea();
        System.out.println( area.maxAreaOfIsland( grid));
    }
}
