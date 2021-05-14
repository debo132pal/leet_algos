package com.algos.arrays;

import java.util.LinkedList;
import java.util.List;

public class KClosest {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int start = 0 ;
        int end =  arr.length - 1;
        List<Integer> result = new LinkedList<>();
        while ( end - start >= k ){

            int diffA = Math.abs( arr[start] - x );
            int diffB = Math.abs( arr[end]   - x );
            if( diffA <= diffB ){
                end--;
            } else if ( diffA > diffB ){
                start++;
            }
        }

        if( ( end - start + 1) == k ){
            for( int i = start ; i <= end ; i++ ){
                result.add( arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] a = { 1  };
        KClosest kC = new KClosest();
        System.out.println( kC.findClosestElements( a , 1, 1 ) );
    }


}
