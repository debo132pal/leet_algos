package com.algos.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class CanAttendMeeting {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] m1, int[] m2) {
                return m1[0] - m2[0];
            }
        });
        boolean canAttend = true;
        for( int i = 1 ; i < intervals.length ; i++ ){
            if( intervals[i][0] < intervals[i-1][1] )
                return false;

        }


        return canAttend;

    }
}
