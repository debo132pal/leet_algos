package com.algos.windows;

import java.util.HashMap;
import java.util.Map;

public class FruitToBasket {
    public int totalFruit(int[] tree) {
        Map<Integer,Integer> basketFruit = new HashMap<>();
        int max = 0;
        int start = 0;
        int noOfBasket = 2;
        for( int end = 0 ; end < tree.length ; end++ ){
            int fruitType = tree[end];
            basketFruit.put( fruitType, basketFruit.getOrDefault(fruitType,0) + 1 );
            while( basketFruit.size() > noOfBasket ){
                int type = tree[start];
                basketFruit.put( type,basketFruit.get(type) - 1);
                if( basketFruit.get(type) == 0 ) {
                    basketFruit.remove(type);
                }
                start++;
            }
            int sum = 0;

            max = Math.max( max , end - start + 1 ) ;
        }
        return max;
    }


    public static void main(String[] args) {
        int[] fruits = { 3,3,3,1,2,1,1,2,3,3,4 };
        System.out.println( new FruitToBasket().totalFruit(fruits));

        int[] fruits1 = { 1,2,3,2,2 };
        System.out.println( new FruitToBasket().totalFruit(fruits1));

        int[] fruits2 = { 0,0,0,8,3,8,3,7,4 };
        System.out.println( new FruitToBasket().totalFruit(fruits2));

        int[] fruits3 = {1,0,1,4,1,4,1,2,3};
        System.out.println( new FruitToBasket().totalFruit(fruits3));
    }
}
