package com.xworkz.comparable.main;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int age;
    long phoneNumber;


    public String toString() {
        return "StudentDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public Student(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("Ram",20,78563183l));
        list.add(new Student("Prabhas",43,56316347l));
        list.add(new Student("NTR",34,657316203l));
        list.add(new Student("AnushkaShetty",40,7462916463l));

        System.out.println(list);

        for(Student student:list){
            System.out.println(student);
        }
    }
}
