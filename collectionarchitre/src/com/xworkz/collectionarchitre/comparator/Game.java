package com.xworkz.collectionarchitre.comparator;

import java.util.HashMap;
import java.util.Map;

public class Game {
    public static void main(String[] args) {


        Map<String,Integer> map=new HashMap<>();
        map.put("Telugu Titans",3);
        map.put("Harayana Steelers",23);
        map.put("U Mumba",23);
        map.put("Patna Pirates",23);
        map.put("Tamil Thalaivas",23);
        map.put("Gujarat Giants",23);


        for (Map.Entry<String,Integer> entry1:map.entrySet()){
            System.out.println(entry1.getKey() + " and " + entry1.getValue());
        }



        for (String key:map.keySet()){
            //System.out.println(map.get(key));
            System.out.println("------------------");
            System.out.println(key);
        }

        for (Integer num:map.values()){
            System.out.println(num);
        }

        map.forEach((K,V)-> System.out.println("Key is : " + K + "And Values is : " + V));


        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("Telugu Titans"));
        System.out.println(map.size());

    }
}
