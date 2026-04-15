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






















                Set<Integer> set1 = new LinkedHashSet<>();

                // 🔹 1. add()
                set1.add(10);
                set1.add(20);
                set1.add(30);
                set1.add(10); // duplicate ignored
                System.out.println("After add: " + set1);

                // 🔹 2. contains()
                System.out.println("Contains 20? " + set1.contains(20));

                // 🔹 3. size()
                System.out.println("Size: " + set1.size());

                // 🔹 4. isEmpty()
                System.out.println("Is Empty? " + set1.isEmpty());

                // 🔹 5. remove()
                set1.remove(20);
                System.out.println("After remove 20: " + set1);

                // 🔹 6. addAll()
                Set<Integer> set6 = new LinkedHashSet<>();
                set6.add(40);
                set6.add(50);

                set1.addAll(set6);
                System.out.println("After addAll: " + set1);

                // 🔹 7. containsAll()
                System.out.println("ContainsAll set2? " + set1.containsAll(set2));

                // 🔹 8. removeAll()
                set1.removeAll(set2);
                System.out.println("After removeAll: " + set1);

                // 🔹 9. retainAll()
                set1.add(40);
                set1.add(50);
                set1.retainAll(Arrays.asList(30, 50));
                System.out.println("After retainAll: " + set1);

                // 🔹 10. Iterator
                System.out.print("Iterator: ");
                Iterator<Integer> itt = set1.iterator();
                while (itt.hasNext()) {
                    System.out.print(it.next() + " ");
                }
                System.out.println();

                // 🔹 11. for-each
                System.out.print("For-each: ");
                for (Integer val : set1) {
                    System.out.print(val + " ");
                }
                System.out.println();

                // 🔹 12. forEach
                System.out.print("forEach: ");
                set1.forEach(val -> System.out.print(val + " "));
                System.out.println();

                // 🔹 13. toArray()
                Object[] arr1 = set1.toArray();
                System.out.println("Array: " + Arrays.toString(arr1));

                // 🔹 14. Convert to List
                List<Integer> list = new ArrayList<>(set1);

                // 🔹 15. Sorting
                Collections.sort(list);
                System.out.println("Sorted: " + list);

                // 🔹 16. Reverse
                Collections.reverse(list);
                System.out.println("Reversed: " + list);

                // 🔹 17. Max / Min
                System.out.println("Max: " + Collections.max(list));
                System.out.println("Min: " + Collections.min(list));

                // 🔹 18. Frequency
                list.add(50);
                System.out.println("Frequency of 50: " +
                        Collections.frequency(list, 50));

                // 🔹 19. Shuffle
                Collections.shuffle(list);
                System.out.println("Shuffled: " + list);

                // 🔹 20. clear()
                set1.clear();
                System.out.println("After clear: " + set1);

                // 🔹 21. isEmpty()
                System.out.println("Is Empty? " + set1.isEmpty());
            }
        }