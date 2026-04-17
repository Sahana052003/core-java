package com.xworkz.collection.runner;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
//        List<String> list=new LinkedList<>();
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Mango");
//        list.add("Grapes");
//        list.add("Orange");
//        list.add("Pineapple");
//        System.out.println("List is : " + list);
//
//        System.out.println("First: " + list.get(3));
//
//
//
//        System.out.println("Iterating:");
//        for(String item : list) {
//            System.out.println(item);
//        }



        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 1. add()
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // 2. addFirst() / addLast()
        list.addFirst("Start");
        list.addLast("End");

        System.out.println("After add: " + list);

        // 3. get()
        System.out.println("Get index 2: " + list.get(2));

        // 4. getFirst() / getLast()
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        // 5. set()
        list.set(1, "Orange");
        System.out.println("After set: " + list);

        // 6. contains()
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // 7. size()
        System.out.println("Size: " + list.size());

        // 8. remove()
        list.remove("Mango");
        System.out.println("After remove Mango: " + list);

        // 9. removeFirst() / removeLast()
        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst & removeLast: " + list);

        // 10. indexOf()
        System.out.println("Index of Banana: " + list.indexOf("Banana"));

        // 11. addAll()
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Kiwi");
        list2.add("Pineapple");

        list.addAll(list2);
        System.out.println("After addAll: " + list);

        // 12. removeAll()
        list.removeAll(list2);
        System.out.println("After removeAll: " + list);

        // 13. retainAll()
        LinkedList<String> list3 = new LinkedList<>();
        list3.add("Orange");

        list.retainAll(list3);
        System.out.println("After retainAll: " + list);

        // 14. iteration (for-each)
        System.out.println("For-each:");
        for (String item : list) {
            System.out.println(item);
        }

        // 15. iterator()
        System.out.println("Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 16. clear()
        list.clear();
        System.out.println("After clear: " + list);

        // 17. isEmpty()
        System.out.println("Is Empty? " + list.isEmpty());
    }
}
