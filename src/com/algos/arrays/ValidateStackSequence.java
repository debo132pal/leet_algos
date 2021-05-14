package com.algos.arrays;

import java.util.Stack;

public class ValidateStackSequence {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> result = new Stack<>();
            int pushedIdx = 0;
            int currPopIdx = 0;
            while ( currPopIdx < popped.length && pushedIdx < pushed.length ){
                while( pushedIdx < pushed.length && pushed[pushedIdx] != popped[currPopIdx] ){
                    result.push( pushed[pushedIdx] );
                    pushedIdx++;
                }
                currPopIdx++;
                while( ! result.isEmpty() && result.peek() == popped[currPopIdx] ){
                    result.pop();
                    currPopIdx++;
                }

                pushedIdx++;
            }

            return result.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4, 5, 6, 7};
        int[] popped = {1,2,3,4,5};


        ValidateStackSequence ss = new ValidateStackSequence();
        System.out.println( ss.validateStackSequences(pushed,popped));
    }
}
