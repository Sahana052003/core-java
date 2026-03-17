package com.xworkz.collection.main;

import java.util.*;

public class Person {
    public static void main(String[] args) {
//        Stack stack=new Stack<>();
//
//        stack.push(30);
//        stack.push(49);
//        stack.push(12);
//        stack.push(34);
//        stack.push(34);
//
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack);
//
//        for (int i= stack.size();i>=0;i++){
//            stack.pop();
//
//        }

        List list=new ArrayList<>();
        list.add(56);
        list.add(345);
        list.add(4567);
        list.add(2345);
        list.add(2345);

        Collections.sort(list);
        Collections.sort(list,Collections.reverseOrder());
//        Collections.shuffle(list);
        System.out.println(list);
    }
}
