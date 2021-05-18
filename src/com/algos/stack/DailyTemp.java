package com.algos.stack;

import java.util.Stack;

public class DailyTemp {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> result = new Stack<>();
        int[] temp = new int[ temperatures.length ];
        result.push(0);
        for( int i = 1; i < temperatures.length ; i++ ){
            while( !result.isEmpty() && temperatures[i] > temperatures[result.peek()]) {
                int idx = result.pop();
                int d = i - idx;
                temp[idx] = d;
            }
            result.push(i);
        }
        while( !result.isEmpty()){
            int idx = result.pop();
            temp[idx] = 0;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] t = {73,74,75,71,69,72,76,73};
        DailyTemp temp = new DailyTemp();
        int[] r = temp.dailyTemperatures(t);
        for( int e : r )
            System.out.println( e );
    }
}
