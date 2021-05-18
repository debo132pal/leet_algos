package com.algos.backtrack;

import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        helper( new LinkedList<>() , result , target , candidates , 0);
        return result;
    }

    private void helper(LinkedList<Integer> values, List<List<Integer>> result, int target, int[] candidates, int pos) {
        if( target == 0 ){
            result.add( new LinkedList<>( values));
            return;
        } else {
            for ( int currPos = pos ; currPos < candidates.length ; currPos++ ){
                if( target - candidates[currPos] >= 0 ){
                    values.addLast( candidates[currPos]);
                    helper( values , result , target - candidates[currPos] , candidates , currPos );
                    values.removeLast();
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] candidates = { 3,2,6,7 };
        CombinationSum sc = new CombinationSum();
        System.out.println( sc.combinationSum( candidates , 7));

        int[] candidates1 = { 2,3,5 };
        System.out.println( sc.combinationSum( candidates1 , 8));

        int[] candidates2 = { 1};
        System.out.println( sc.combinationSum( candidates1 , 2));
    }
}
