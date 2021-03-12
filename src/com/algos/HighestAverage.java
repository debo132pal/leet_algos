package com.algos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HighestAverage {
    public int highestAverage(String[][] scores) {
        Map<String , List<Integer> > result = new HashMap<>();
        for( String[] e : scores ){
            result.putIfAbsent( e[0] , new LinkedList<>());
            try{
                result.get(e[0]).add( Integer.valueOf(e[1]));
            } catch ( Exception o ){
                System.out.println("here");
            }

        }
        float maxAverge = Float
                .MIN_VALUE;
        for( String name : result.keySet()){
            double avg = 0;
            List<Integer> numbers = result.get(name);
            int sum = 0;
            for( int i : numbers ){
                sum += i;
            }
            maxAverge = Float.max( maxAverge, sum /numbers.size());
        }

        return (int) Math.round( maxAverge);

    }

    public static void main(String[] args) {
        String[][] s = { {"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99ss"} };
        HighestAverage average = new HighestAverage();
        System.out.println( average.highestAverage( s ));
    }
}
