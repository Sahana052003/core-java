package com.xworkz.collection.runner;

import com.xworkz.collection.comparator.LaptopComparator;
import com.xworkz.collection.comparator.NameComparator;


import java.util.*;

public class Laptop {
    public static void main(String[] args) {
        List<LaptopComparator> list=new LinkedList<>();
        list.add((new LaptopComparator("HP",30000)));
        list.add((new LaptopComparator("Dell",45000)));
        list.add((new LaptopComparator("lenovo",15000)));
        list.add((new LaptopComparator("HP",32000)));
        System.out.println("Products are : " + list);


        //Traverse
        System.out.println("Before Sorting");
        for (LaptopComparator name : list){
            System.out.println(name);
        }
       Collections.sort(list,new NameComparator());
        System.out.println("After Sorting");
        for (LaptopComparator name1 : list){
            System.out.println(name1);
        }
    }
}
