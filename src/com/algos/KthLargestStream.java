package com.algos;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestStream {

    private PriorityQueue<Integer> pq ;
    private int k ;
    public KthLargestStream(int k, int[] nums) {
        pq = new PriorityQueue<>( k ) ;
        this.k = k;
        for( int n : nums ) pq.add( n );
    }

    public int add(int val) {
            pq.add(val);
            if ( pq.size() > k ){
                pq.poll();
            }
            return pq.peek();
      }


}
