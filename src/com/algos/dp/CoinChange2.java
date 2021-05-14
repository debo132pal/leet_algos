package com.algos.dp;

public class CoinChange2 {
    public int change(int amount, int[] coins) {
        int[] result = new int[amount + 1];
        result[0] = 1;
        for( int c: coins){
            for( int currAmount = 1 ; currAmount <= amount ; currAmount++  ){
                if( currAmount >= c ){
                    result[currAmount] += result[currAmount - c];
                }
            }
          }
        return result[amount];
    }

    public static void main(String[] args) {
        CoinChange2 cc = new CoinChange2();
        System.out.println( cc.change( 3 , new int[] { 1, 2, 5 }));
    }
}
