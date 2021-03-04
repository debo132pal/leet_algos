package com.algos;

import java.util.Arrays;

public class MinCoinChange {
    public int coinChange(int[] coins, int amount) {
        int[]  coinChange = new int[ amount + 1];
        Arrays.fill( coinChange , Integer.MAX_VALUE);
        coinChange[0] = 0;

        for( int i = 1 ; i <= amount ; i++ ){
            for( int c:coins ){
                int d = i - c;
                if( d >= 0 && coinChange[d] < Integer.MAX_VALUE ){
                    coinChange[i] = Math.min( coinChange[i] , coinChange[d] + 1);
                }
            }
        }
        if( coinChange[amount] == Integer.MAX_VALUE )
            return -1;
        return coinChange[amount];
    }

    public static void main(String[] args) {
        int[] coins = { 1 , 2 ,5 };
        MinCoinChange cc = new MinCoinChange();
        System.out.println( cc.coinChange( coins, 11 ));

        int[] coins1 = { 2 };
        System.out.println( cc.coinChange( coins1, 3 ));

        int[] coins2 = { 1 };
        System.out.println( cc.coinChange( coins2, 0 ));
    }
}
