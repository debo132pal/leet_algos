package com.algos.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CC {
    public int countComponents(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for( int i = 0 ; i < n ; i++ ){
            graph.put(i , new LinkedList<>());
        }
        for ( int[] e : edges ){
            graph.get(e[0]).add(e[1]);
        }
        boolean[] visited = new boolean[n];
        int C = 0;
        for ( int i = 0 ; i < n ; i++   ){
            if( !visited[i] ){
                C++;
                dfs( graph , i , visited );
            }
        }
        return C;
    }

    private void dfs(Map<Integer, List<Integer>> graph, int i, boolean[] visited) {
         visited[i] = true;
         List<Integer> e = graph.get(i);
         for( int x : e ){
             if( !visited[x] ) {
                 dfs(graph , x , visited);
             }
         }
    }

    public static void main(String[] args) {
        int n = 5;

    }
}
