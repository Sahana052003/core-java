package com.xworkz.collection.runner;
import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {

        // 1. Create Hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        // 2. put()
        ht.put("one", 1);
        ht.put("two", 2);
        ht.put("three", 3);

        System.out.println("Initial Hashtable: " + ht);

        // 3. get()
        System.out.println("Value for 'two': " + ht.get("two"));

        // 4. containsKey() and containsValue()
        System.out.println("Contains key 'three'? " + ht.containsKey("three"));
        System.out.println("Contains value 5? " + ht.containsValue(5));

        // 5. size() and isEmpty()
        System.out.println("Size: " + ht.size());
        System.out.println("Is empty? " + ht.isEmpty());

        // 6. remove()
        ht.remove("one");
        System.out.println("After removing 'one': " + ht);

        // 7. putIfAbsent()
        ht.putIfAbsent("two", 22); // won't replace
        ht.putIfAbsent("four", 4);
        System.out.println("After putIfAbsent: " + ht);

        // 8. replace()
        ht.replace("two", 22);
        System.out.println("After replace: " + ht);

        // 9. getOrDefault()
        System.out.println("Get 'five' with default: " + ht.getOrDefault("five", 0));

        // 10. computeIfAbsent()
        ht.computeIfAbsent("five", k -> 5);
        System.out.println("After computeIfAbsent: " + ht);

        // 11. computeIfPresent()
        ht.computeIfPresent("two", (k, v) -> v * 10);
        System.out.println("After computeIfPresent: " + ht);


        // 13. merge()
        ht.merge("four", 10, (oldVal, newVal) -> oldVal + newVal);
        System.out.println("After merge: " + ht);

        // 14. keySet()
        System.out.println("Keys: " + ht.keySet());

        // 15. values()
        System.out.println("Values: " + ht.values());

        // 16. entrySet()
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : ht.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 17. forEach()
        System.out.println("Using forEach:");
        ht.forEach((k, v) -> System.out.println(k + " -> " + v));

        // 19. clear()
        ht.clear();
        System.out.println("After clear: " + ht);
    }
}