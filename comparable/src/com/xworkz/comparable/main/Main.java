package com.xworkz.comparable.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(56);
        list.add(77);
        list.add(1);
        list.add(45);
        list.add(5);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);

        System.out.println(list);
    }
}
