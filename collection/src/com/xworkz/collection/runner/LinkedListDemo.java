package com.xworkz.collection.runner;


import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Grapes");
        list.add("Orange");
        list.add("Pineapple");
        System.out.println("List is : " + list);

        System.out.println("First: " + list.get(3));



        System.out.println("Iterating:");
        for(String item : list) {
            System.out.println(item);
        }

    }
}
