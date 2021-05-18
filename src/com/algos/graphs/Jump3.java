package com.algos.graphs;

public class Jump3 {

    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return  dfs( visited , start , arr );
    }

    private boolean dfs(boolean[] visited, int start, int[] arr) {
        if( start >= arr.length || start < 0 )
            return false;
        if( visited[start] )  return false;
        else if( arr[start] == 0 )  return true;
        else {
            visited[start] = true;
            return  ( dfs( visited , start - arr[start] , arr ) || dfs( visited , start  + arr[start] , arr ));
        }
    }

    public static void main(String[] args) {
        Jump3 jp = new Jump3();
        int[] arr = {4,2,3,0,3,1,2};
        System.out.println( jp.canReach( arr, 0 ));
        int[] arr1 = {3,0,2,1,2};
        System.out.println( jp.canReach( arr1, 0 ));
    }
}
