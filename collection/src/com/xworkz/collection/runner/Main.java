package com.xworkz.collection.runner;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(4567);
        list.add(21);
        list.add(567);
        list.add(4567);
        list.add(45678);
        list.add(34567);
        list.add(4356);
        System.out.println(list);
        List<Integer> list1=new ArrayList<>();
        list1.addAll(list);
        System.out.println(list1);

        list.remove(1);
        System.out.println(list);
//        list.removeAll(list1);
//        System.out.println(list);
        list.removeIf(n->n%2==0);
        System.out.println(list);

        list.removeIf(n->n<1000);
        System.out.println(list);



        list.retainAll(list1);
        System.out.println(list);



        System.out.println(list.contains(4567));

        System.out.println(list.containsAll(list1));


        System.out.println(list.size());

        System.out.println(list.isEmpty());

        System.out.println(list.equals(list1));

        System.out.println(list.hashCode());

        System.out.println(Arrays.toString(list.toArray()));


        list.clear();
        System.out.println(list);




        for (Integer n:list1){
            System.out.println(n);
        }


//        for (Integer nn:list1){
//            if(nn==4356){
//                list1.remove(nn);
//                System.out.println(nn);
//            }

        Iterator<Integer> iterator=list1.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next==4356){
            iterator.remove();
            }
            System.out.println(list1);
        }


        Collections.sort(list1);
        System.out.println(list1);

        Collections.sort(list1,Collections.reverseOrder());
        System.out.println(list1);

        Collections.reverse(list1);
        System.out.println(list1);

        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));


        List<Character> vowels=Arrays.asList('a','e','i','o','u');
        System.out.println(vowels);



    }
}
