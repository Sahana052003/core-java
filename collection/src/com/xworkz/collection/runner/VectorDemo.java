package com.xworkz.collection.runner;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        // Create Vector
        Vector<Integer> v = new Vector<>();

        // 1. add() → Add elements
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println("Vector after add: " + v);

        // 2. add(index, element)
        v.add(1, 15);
        System.out.println("After inserting at index 1: " + v);

        // 3. addElement()
        v.addElement(50);
        System.out.println("After addElement(): " + v);

        // 4. size()
        System.out.println("Size: " + v.size());

        // 5. capacity()
        System.out.println("Capacity: " + v.capacity());

        // 6. get(index)
        System.out.println("Element at index 2: " + v.get(2));

        // 7. firstElement() & lastElement()
        System.out.println("First Element: " + v.firstElement());
        System.out.println("Last Element: " + v.lastElement());

        // 8. contains()
        System.out.println("Contains 30? " + v.contains(30));

        // 9. indexOf()
        System.out.println("Index of 30: " + v.indexOf(30));

        // 10. set(index, element)
        v.set(2, 99);
        System.out.println("After set(): " + v);

        // 11. remove(index)
        v.remove(1);
        System.out.println("After remove index 1: " + v);

        // 12. removeElement()
        v.removeElement(99);
        System.out.println("After removeElement(99): " + v);

        // 13. clone()
        Vector<Integer> v2 = (Vector<Integer>) v.clone();
        System.out.println("Cloned Vector: " + v2);

        // 14. isEmpty()
        System.out.println("Is empty? " + v.isEmpty());

        // 15. clear()
        v.clear();
        System.out.println("After clear(): " + v);

        // Final check
        System.out.println("Is empty now? " + v.isEmpty());
    }
}