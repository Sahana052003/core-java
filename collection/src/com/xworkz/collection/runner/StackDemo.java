package com.xworkz.collection.runner;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        // Create Stack
        Stack<Integer> stack = new Stack<>();

        // 1. push() → Add elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack after push: " + stack);

        // 2. peek() → View top element
        System.out.println("Top element (peek): " + stack.peek());

        // 3. pop() → Remove top element
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // 4. empty() → Check if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // 5. search() → Find position from top
        System.out.println("Position of 20 from top: " + stack.search(20));

        // 6. size()
        System.out.println("Stack size: " + stack.size());

        // 7. contains()
        System.out.println("Stack contains 30? " + stack.contains(30));

        // 8. get(index)
        System.out.println("Element at index 1: " + stack.get(1));

        // 9. add() (Vector method)
        stack.add(50);
        System.out.println("After add(): " + stack);

        // 10. remove(index)
        stack.remove(1);
        System.out.println("After remove index 1: " + stack);

        // 11. clone()
        Stack<Integer> clonedStack = (Stack<Integer>) stack.clone();
        System.out.println("Cloned Stack: " + clonedStack);

        // 12. clear()
        stack.clear();
        System.out.println("Stack after clear: " + stack);

        // Final check
        System.out.println("Is stack empty now? " + stack.isEmpty());
    }
}