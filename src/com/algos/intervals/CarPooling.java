package com.algos.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {

        int[][] endTrip = new int[trips.length][3];
        for( int i = 0 ; i < trips.length ; i++ ){
            endTrip[i][0] = trips[i][0];
            endTrip[i][1] = trips[i][1];
            endTrip[i][2] = trips[i][2];
        }
        Arrays.sort(trips, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        Arrays.sort(endTrip, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });

        int start = 0;
        int currRider = 0;
       for( int end = 0 ; end < trips.length ; end++ ){
           int endTime = endTrip[end][2];

           while( start < trips.length && trips[start][1] < endTime ){
              currRider += trips[start][0];

               System.out.println( trips[start][1] + "  " + trips[start][0]);
               System.out.println( currRider);
               if( currRider > capacity)
                   return false;
               start++;
           }
           System.out.println("+++++++++++++++++++++");
           currRider -= endTrip[end][0];
       }
        return true;
    }

    public static void main(String[] args) {
        int[][] trips = { {3,2,7},{3,7,9},{8,3,9}};
        CarPooling carPooling = new CarPooling();
      //  System.out.println( carPooling.carPooling( trips, 11));
        int[][] t1 = { {3,2,9},{3,2,8},{5,2,5},{7,4,8},{8,7,8},{9,1,2}};
        System.out.println( carPooling.carPooling( t1 ,22));
    }
}
