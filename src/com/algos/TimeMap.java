package com.algos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeMap {
    private HashMap<String,TreeMap<Integer,String>> timeMap;
//    private TreeMap<Integer, HashMap<String,String>> timeMap;
    public TimeMap() {
        timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TreeMap<Integer,String> kv = timeMap.get(key);
        if( kv == null ){
            kv = new TreeMap<>();
            timeMap.put( key , kv);
        }
        kv.put(timestamp,value);

    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> value = timeMap.get(key);
        if (value != null) {
            if (value.containsKey(timestamp))
                return value.get(timestamp);
            else {
                Map.Entry<Integer, String> integerStringEntry = value.floorEntry(timestamp);
                if (integerStringEntry != null) {
                    return integerStringEntry.getValue();
                }
            }

        }
        return new String();
    }

    public static void main(String[] args) {
        TimeMap map = new TimeMap();
        map.set("love","high",10);
        map.set("love","low",20);
        System.out.println( map.get("love",5));
        System.out.println( map.get("love",10));
        System.out.println( map.get("love",15));
        System.out.println( map.get("love",20));
        System.out.println( map.get("love",25));

    }
}
