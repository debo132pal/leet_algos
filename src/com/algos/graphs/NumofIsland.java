package com.algos.graphs;

public class NumofIsland {
    public int numIslands(char[][] grid) {
        int noOfIsland= 0;
        int m = grid.length;
        int n = grid[0].length;
        for( int i = 0 ; i < m ; i++ ){
            for( int j = 0 ; j < n ; j++ ){
                if( grid[i][j] == '1') {
                    noOfIsland++;
                    dfs( grid , i , j );
                }
            }

        }
        return noOfIsland;

    }

    private void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if( i < 0 || i >= m ) return;
        if( j < 0 || j >= n ) return;
        if ( grid[i][j] == '0' ) return;
        grid[i][j] = '0';
        dfs( grid , i + 1 , j );
        dfs( grid , i - 1 , j );
        dfs( grid , i  , j + 1 );
        dfs( grid , i  , j - 1 );
    }
}
