package com.xworkz.collectionarchitre.main;

import java.util.HashMap;
import java.util.Map;

public class MainRunner {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Nandushree",89);
        map.put("Muktha",32);
        map.put("Jhon",87);
        map.put("JK",654);

        System.out.println(map);
        for (String name:map.keySet()){
            System.out.println(name + ":" + map.get(name));


        }
    }
}
