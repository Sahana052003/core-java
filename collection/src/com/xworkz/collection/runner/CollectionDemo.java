package com.xworkz.collection.runner;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(234);
        list.add(13456);
        list.add(234);
        list.add(234);
        list.add(null);
        System.out.println(list);

        List<Integer> list1=new ArrayList<>();

        list1.addAll(list);
        System.out.println(list1.remove(1));
        //System.out.println(list1);


        list1.retainAll(list);
        System.out.println(list1);
    }
}
