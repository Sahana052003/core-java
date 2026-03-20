package com.xworkz.stack.main;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack<>();
        stack.push(12);
        stack.push(234);
        stack.push("Hello");
        stack.push("Hi");
        stack.push(678.123);
        System.out.println(stack);

        System.out.println( stack.pop());


        System.out.println( stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.push(null);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
