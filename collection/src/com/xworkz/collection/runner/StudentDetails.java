package com.xworkz.collection.runner;

import com.xworkz.collection.comparable.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDetails {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(23,"Sora",'P'));
        list.add(new Student(10,"Ram",'V'));
        list.add(new Student(7,"Seeta",'J'));
        list.add(new Student(23,"Karthik",'A'));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
