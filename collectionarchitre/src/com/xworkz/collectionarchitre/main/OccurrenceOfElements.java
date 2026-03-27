package com.xworkz.collectionarchitre.main;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfElements {
    public static void main(String[] args) {
        String name="karthik";
        char[] chars=name.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (char ele:chars){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        System.out.println(map);
    }
}
