package com.xworkz.collection.runner;

import com.xworkz.collection.comparable.Student;

import java.util.*;

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

        for (Student std: list){
            System.out.println(std);
        }
        ListIterator<Student> iterator = list.listIterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            if (next.getName().equals("Ram")){
                iterator.add(new Student(2,"Muktha",'P'));
        }
        }
        System.out.println(list);

        System.out.println("Sorting elements");
        Collections.sort(list);
        for (Student student:list){
            System.out.println(student);
        }

        System.out.println("Reverse the elements");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("Shuffle the elements");
        Collections.shuffle(list);
        System.out.println(list);


    }
}
