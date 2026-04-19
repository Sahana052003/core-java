package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(50);
        list.add(2);
        list.add(8);
        list.add(77);
        list.add(44);
        list.add(45);
        list.add(90);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(6));
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
      List<Integer>list1=new ArrayList<>();
//        list1.add(20);
//        list1.add(40);
//        list1.add(10);
//        list1.add(50);
//        list1.add(2);
//        list1.add(8);
//        list1.add(77);
//        list1.add(44);
//        list1.add(45);
//        list1.add(90);
      list1.add(300);
      list1.add(250);
      list1.add(10);
      list1.add(4);
      list1.add(777);
      //list1.addAll(list);
        System.out.println("Using addAll : " + list);
        System.out.println("Using contains: " + list.contains(300));
        System.out.println("Using containsAll : " + list1.containsAll(list));
        System.out.println("Using Equals : " + list.equals(list1));
//        System.out.println("Using hashcode : " + list.hashCode());
//        System.out.println("Using hashcode of list1 : " + list1.hashCode());
        //System.out.println("Using removeAll : " + list1.removeAll(list));
        System.out.println(list1);
        System.out.println("Using retainsAll : " + list.retainAll(list1));
        for (Integer total:list) {
            System.out.println(total);
        }
        System.out.println("====================");
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer == 250) {
                iterator.remove();
            }
        }
        System.out.println(list1);
    }
}