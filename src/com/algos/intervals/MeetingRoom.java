package com.algos.intervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoom {
    public int minMeetingRooms(int[][] intervals) {
        int minMeetingRoom  = 0;
        int currentMeeting  = 0;
        int currentAvailble = 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] m1, int[] m2) {
                return m1[0] - m2[0];
            }
        });

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] m1, int[] m2) {
                return m1[1] - m2[1];
            }
        });

        for( int i = 0 ; i < intervals.length ; i++ ){
            pq.add( intervals[i] );
        }
        int curr = 0;
        while ( !pq.isEmpty() ){
            int end = pq.poll()[1];
            while( curr < intervals.length && intervals[curr][0] < end ) {
                currentMeeting++;
                minMeetingRoom = Math.max( minMeetingRoom, currentMeeting);
                curr++;
             }
               currentMeeting--;
            }
        return minMeetingRoom;
    }

    public static void main(String[] args) {
        int[][] m = { {7,10},{2,4} };
        MeetingRoom room = new MeetingRoom();
        System.out.println( room.minMeetingRooms( m ));

        int[][] m1 = {{0,30},{5,10} ,{15,20} , { 7,12}};
        System.out.println( room.minMeetingRooms( m1 ));
    }
}
