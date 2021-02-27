package com.algos;

public class ShipWithinDays {

    public int shipWithinDays(int[] weights, int D) {

        int minWeight = 0;
        int maxWeight = 0;
        for( int w : weights ){
            minWeight = Math.max( w , minWeight );
            maxWeight += w;
        }

        while( minWeight < maxWeight ){

            int midW = minWeight + (( maxWeight - minWeight ) / 2 );
            if( feasible( midW , weights , D ) ){
                maxWeight = midW;
            } else {
                minWeight = midW + 1;
            }

        }
        return minWeight;

    }

    private boolean feasible(int midW, int[] weights, int D) {
            int days = 0;
            int currW = 0;
            for ( int w : weights ){
                currW += w;
                if( currW > midW ) {
                    days++;
                    currW = w;
                }
            }
            days++;
            if( days > D )
                return false;
            return true;

    }

    public static void main(String[] args) {
        int[] w = {1,2,3,4,5,6,7,8,9,10};
        ShipWithinDays shipWithinDays = new ShipWithinDays();
    //    System.out.println( shipWithinDays.shipWithinDays( w , 5 ) );

        int[] w1 = {1,2,3,1,1};
        System.out.println( shipWithinDays.shipWithinDays( w1 , 4 ) );
    }


}
