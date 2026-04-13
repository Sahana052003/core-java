package com.xworkz.collection.runner;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        // Create Queue
        Queue<Integer> q = new LinkedList<>();

        // 1. add() / offer()
        q.add(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Queue after add/offer: " + q);

        // 2. peek() (safe)
        System.out.println("Peek: " + q.peek());

        // 3. element() (throws exception if empty)
        System.out.println("Element: " + q.element());

        // 4. poll() (safe remove)
        System.out.println("Poll: " + q.poll());
        System.out.println("After poll: " + q);

        // 5. remove() (throws exception if empty)
        System.out.println("Remove: " + q.remove());
        System.out.println("After remove: " + q);

        // 6. size()
        System.out.println("Size: " + q.size());

        // 7. contains()
        System.out.println("Contains 30? " + q.contains(30));

        // 8. iteration
        System.out.print("Queue elements: ");
        for (int val : q) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 9. addAll()
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(40);
        q2.add(50);

        q.addAll(q2);
        System.out.println("After addAll: " + q);

        // 10. removeAll()
        q.removeAll(q2);
        System.out.println("After removeAll: " + q);

        // 11. clear()
        q.clear();
        System.out.println("After clear: " + q);

        // 12. isEmpty()
        System.out.println("Is Empty? " + q.isEmpty());
    }
}