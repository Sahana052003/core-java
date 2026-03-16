package com.xworkz.collection.main;

import java.util.Stack;

public class Person {
    public static void main(String[] args) {
        Stack stack=new Stack<>();

        stack.push(30);
        stack.push(49);
        stack.push(12);
        stack.push(34);
        stack.push(34);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);

        for (int i= stack.size();i>=0;i++){
            stack.pop();

        }
    }
}
