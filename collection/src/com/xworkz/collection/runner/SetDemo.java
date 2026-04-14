package com.xworkz.collection.runner;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        // Create Set
        Set<String> set = new HashSet<>();

        // 1. add()
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A"); // duplicate (ignored)

        System.out.println("After add(): " + set);

        // 2. contains()
        System.out.println("Contains B? " + set.contains("B"));

        // 3. size()
        System.out.println("Size: " + set.size());

        // 4. isEmpty()
        System.out.println("Is Empty? " + set.isEmpty());

        // 5. iterator()
        System.out.print("Using Iterator: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 6. remove()
        set.remove("B");
        System.out.println("After remove(B): " + set);

        // 7. addAll()
        Set<String> set2 = new HashSet<>();
        set2.add("D");
        set2.add("E");

        set.addAll(set2);
        System.out.println("After addAll(): " + set);

        // 8. containsAll()
        System.out.println("ContainsAll set2? " + set.containsAll(set2));

        // 9. removeAll()
        set.removeAll(set2);
        System.out.println("After removeAll(set2): " + set);

        // 10. retainAll()
        Set<String> set3 = new HashSet<>();
        set3.add("A");
        set3.add("X");

        set.retainAll(set3);
        System.out.println("After retainAll(set3): " + set);

        // 11. toArray()
        Object[] arr = set.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // 12. hashCode()
        System.out.println("HashCode: " + set.hashCode());

        // 13. clear()
        set.clear();
        System.out.println("After clear(): " + set);

        // 14. isEmpty() again
        System.out.println("Is Empty now? " + set.isEmpty());
    }
}