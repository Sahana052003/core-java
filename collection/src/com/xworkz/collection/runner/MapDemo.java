package com.xworkz.collection.runner;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        // Create Map
        Map<String, Integer> map = new HashMap<>();

        // 1. put()
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        System.out.println("After put: " + map);

        // 2. get()
        System.out.println("Get A: " + map.get("A"));

        // 3. containsKey()
        System.out.println("Contains key B? " + map.containsKey("B"));

        // 4. containsValue()
        System.out.println("Contains value 30? " + map.containsValue(30));

        // 5. size()
        System.out.println("Size: " + map.size());

        // 6. isEmpty()
        System.out.println("Is Empty? " + map.isEmpty());

        // 7. putIfAbsent()
        map.putIfAbsent("A", 100); // won't replace
        map.putIfAbsent("D", 40);
        System.out.println("After putIfAbsent: " + map);

        // 8. getOrDefault()
        System.out.println("GetOrDefault E: " + map.getOrDefault("E", 0));

        // 9. remove()
        map.remove("B");
        System.out.println("After remove B: " + map);

        // 10. replace()
        map.replace("C", 300);
        System.out.println("After replace C: " + map);

        // 11. replace(key, old, new)
        map.replace("A", 10, 111);
        System.out.println("After conditional replace: " + map);

        // 12. keySet()
        System.out.println("Keys: " + map.keySet());

        // 13. values()
        System.out.println("Values: " + map.values());

        // 14. entrySet() (MOST IMPORTANT)
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 15. forEach() (Java 8)
        map.forEach((k, v) -> System.out.println(k + ":" + v));

        // 16. computeIfAbsent()
        map.computeIfAbsent("E", k -> 50);
        System.out.println("After computeIfAbsent: " + map);

        // 17. computeIfPresent()
        map.computeIfPresent("A", (k, v) -> v + 10);
        System.out.println("After computeIfPresent: " + map);

        // 18. merge()
        map.merge("A", 5, (oldVal, newVal) -> oldVal + newVal);
        System.out.println("After merge: " + map);

        // 19. clear()
        map.clear();
        System.out.println("After clear: " + map);
    }
}