package com.algos;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class HighFive {

    public int[][] highFive(int[][] items) {

        int K = 5;
        TreeMap<Integer, PriorityQueue<Integer>> map = new TreeMap<>();

         for( int[] e : items ){
             map.putIfAbsent( e[0] , new PriorityQueue<>() );
             map.get(e[0]).add(e[1]);
         }

        int[][] result = new int[map.size()][2];
        int idx = 0;

        for( Integer e : map.keySet() ){
             PriorityQueue<Integer> pq = map.get(e);
             while ( pq.size()  > K ){
                 pq.poll();
             }
             int sum = 0;
             for( Integer n:  pq){
                 sum += n;
             }
             sum = sum/K;
             result[idx][0] = e;
             result[idx][1] = sum;
             idx++;
         }
         return result;

    }

    public static void main(String[] args) {
        int[][] nums = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
        HighFive five = new HighFive();
        int[][] result = five.highFive(nums);
        for( int i = 0 ; i < result.length ; i++ ){
            System.out.println( result[i][0] +"   " + result[i][1]);
        }

        int[][] nums1 = {{1,100},{7,100},{1,100},{7,100},{1,100},{7,100},{1,100},{7,100},{1,100},{7,100}};
        result = five.highFive(nums1);
        for( int i = 0 ; i < result.length ; i++ ){
            System.out.println( result[i][0] +"   " + result[i][1]);
        }
    }
}
