package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    Integer usn;
    String name;
    Integer age;

    public Student(Integer usn, String name, Integer age) {
        this.usn = usn;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "StudentData{usn="+usn + "NAme is : " + name + " and Age is : " + age + "}";
    }

    public static void main(String[] args) {
        Student student=new Student(1234,"Ram",21);
        Student student1=new Student(12,"nandu",25);

        List<Student> list=new ArrayList<>();
        list.add(student);
        list.add(student1);

        for (Student student2:list) {
            System.out.println(list);
        }
    }
}
