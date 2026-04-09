package com.xworkz.collection.runner;

import java.util.*;

import static javax.swing.UIManager.get;

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


//        List<Character> vowels=Arrays.asList('a','e','i','o','u');
//        System.out.println(vowels);
//
////        List<Character> vowels1=List.of('a','e','i','o','u');
//
//
//        Integer[] arr=list1.toArray(list1.toArray(new Integer[0]));
//        System.out.println(Arrays.toString(arr));
//
//        List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4));
//        System.out.println(list2);
//        list2.add(234);
//        System.out.println(list2);


        Collections.shuffle(list1);
        System.out.println("Shuffle the list " + list1);



        //the reference is collection-group of objects,so it can't get a single element(where it doen't have get()) ,but the actual object is ArrayList through this i can get a single object
        Collection<Integer> collection=new ArrayList<>();
        collection.add(5678);
        collection.add(45678);
        System.out.println(collection);
        System.out.println(((ArrayList<Integer>) collection).get(1));//typecast it

        Collections.shuffle((List<Integer>) collection);
        System.out.println("" + collection);
    }
}
