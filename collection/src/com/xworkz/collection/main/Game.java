package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(39);
        list.add(1);
        list.add(67);
        list.add(567);
        list.add(2345);
        list.add(12345);
        List<Integer> list1=new ArrayList<>(list);
        System.out.println(list1);
        System.out.println("-----------------------");

        for (Integer value:list1){
            System.out.println(value);
        }

        System.out.println("==========================");
        for (int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

        System.out.println("+++++++++++++++++++++++++++");
        for (Integer num:list){
            if(num==39)
                list.remove(num);
        }
    }
}
