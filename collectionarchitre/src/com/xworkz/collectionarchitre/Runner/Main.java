package com.xworkz.collectionarchitre.Runner;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set list=new HashSet<>();
        Person person=new Person(56,"Diya",23);
        Person person1=new Person(76,"Ram",30);
        Person person2=new Person(12,"Kavya",22);
        list.add(person);
        list.add(person1);
        list.add(person2);
        list.add(person);
        System.out.println(list);


        TreeSet<Person> treeSet=new TreeSet<>();
        treeSet.add(person);
        treeSet.add(person1);
        treeSet.add(person2);
        System.out.println(treeSet);

    }
}
