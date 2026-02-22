package com.xworkz.comparable.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
//Java compares characters by Unicode value:
//
//A–Z → 65–90
//a–z → 97–122
        list.add("vehicle");
        list.add("Book");
        list.add("Book");
        list.add("mobile");
        list.add("laptop");
        list.add("Earphone");

        Collections.sort(list);
        System.out.println(list);

    }
}
