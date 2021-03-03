package com.algos;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String> >  grouping =  new HashMap<>();
        for( String s:  strs ){

            char[] chars = s.toCharArray();
            Arrays.sort( chars );
            String id = new String((chars));
            grouping.putIfAbsent( id , new LinkedList<>());
            grouping.get(id).add(s);
        }
        List<List<String>> result = new LinkedList<>();
        for( List<String> e : grouping.values() ){
            result.add(e);
        }
        return result;
    }
}
