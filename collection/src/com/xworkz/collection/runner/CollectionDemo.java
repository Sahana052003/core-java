package com.xworkz.collection.runner;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(234);
        list.add(13456);
        list.add(234);
        list.add(234);
        //list.add(null);
        System.out.println(list);
        System.out.println("000000000000000000000000000");
        System.out.println(list.indexOf(234));
        System.out.println(list.get(2));

        List<Integer> list1=new ArrayList<>();

        list1.addAll(list);
        System.out.println(list1.remove(1));
        //System.out.println(list1);

        list1.retainAll(list);
        System.out.println(list1);
        System.out.println("--------------------------------");
        System.out.println(  list.indexOf(345));


        ListIterator<Integer> itr = list.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        System.out.println("--------------------------------");
        Collections.sort(list);
        System.out.println(list);


        System.out.println("ARRAYLIST");
        List<Integer> list2=new ArrayList<>();
        list2.add(23456);
        list2.add(12);
        list2.add(45);
        list2.add(8);
        list2.add(-4);
        list2.add(23);
        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);



        List<String> list3=new LinkedList<>();
        list3.add("Apple");
        list3.add("Banana");
        list3.add("Mango");
        list3.add("Grapes");
        list3.add("Orange");
        list3.add("Pineapple");
        System.out.println("List is : " + list3);


        for (String s:list3){
            System.out.println(s);
        }

        for (int i=0;i< list3.size();i++){
            System.out.println("traveser loop : " + list3.get(i));
        }

        Iterator<String> iterator = list3.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);

            // check if element contains "a"
            if (item.toLowerCase().contains("e")) {
                iterator.remove();
            }
        }

        System.out.println("After removal: " + list3);

        System.out.println("========================");
        ListIterator<String> li = list3.listIterator();

// Forward
        while (li.hasNext()) {
            System.out.println(li.next());
        }

// Backward
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }


        System.out.println("sdfgds=====================");
        List<Integer> list9=new ArrayList<>();
        list9.add(273);
        Iterator<Integer> iterator1 = list9.iterator();
        while (iterator1.hasNext())
        System.out.println(iterator1.next());







        //ListIterator
        System.out.println("LISTITERATOR");
        ListIterator<String> iterator2 = list3.listIterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
            System.out.println(iterator2.nextIndex());
            System.out.println(iterator2.previousIndex());
        }

        System.out.println("BACKEND TRAVESR");
     while (iterator2.hasPrevious()){
         System.out.println(iterator2.previous());
         System.out.println(iterator2.nextIndex());
         System.out.println(iterator2.previousIndex());
     }
        System.out.println("ADD elements");
     while (iterator2.hasNext()){
         String next = iterator2.next();
         if (next=="Banana"){
             iterator2.add("APPLE");
         }
     }
        System.out.println(list3);


        iterator2 = list3.listIterator();
        System.out.println("SET the elemts in list");
        while (iterator2.hasNext()){
            String s = iterator2.next();
            if(s.equals("Banana")){
                iterator2.set("Pineapple");
            }
        }
        System.out.println(list3);


        iterator2 = list3.listIterator();
        System.out.println("REMOVE the elements in the list");
        while (iterator2.hasNext()){
            String next = iterator2.next();
            if (next.equals("APPLE")){
                iterator2.remove();
            }
        }
        System.out.println(list3);
    }
}
