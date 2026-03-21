package com.xworkz.collectionarchitre.main;

import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {
        Map<String,Integer> std=new HashMap<>();
        std.put("Hi",21);
        std.put("Hello",4);
        std.put("Hi",567);
        std.put("x",567);
        std.put(null,23);
        System.out.println(std);
    }
}
