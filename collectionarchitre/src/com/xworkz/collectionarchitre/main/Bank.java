package com.xworkz.collectionarchitre.main;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    public static void main(String[] args) {
        Set<String> name=new HashSet<>();
        name.add("SBI");
        name.add("Canara");
        name.add("Karnataka");
        name.add("HDFC");
        name.add("SBI");

        System.out.println(name);
        for (String n:name){
            System.out.println(n);
        }
    }
}
