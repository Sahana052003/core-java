package com.xworkz.comparator.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person>,Comparator<Person> {
    private String name;
    private Integer age;
    private Long mobileNumber;

    public Person(String name, Integer age, Long mobileNumber) {
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Comparator<Person> getComparator() {
        return comparator;
    }

    public void setComparator(Comparator<Person> comparator) {
        this.comparator = comparator;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mobileNumber=" + mobileNumber +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person("Sindhu", 23, 76489678733L);
        Person person1 = new Person("Ram", 30, 773829453226L);
        Person person2 = new Person("Jhon", 18, 67825637823L);
        Person person3 = new Person("Kiran", 26, 5678965467L);

        List<Person> list = new ArrayList<>();
        list.add(person);
        list.add(person1);
        list.add(person2);
        list.add(person3);


        System.out.println("Using Comparable");
        Collections.sort(list);
        System.out.println(list);


        System.out.println("Using Comparator ");
        Collections.sort(list, new Person());
        for (Person p : list) {
            System.out.println(p);
        }


        System.out.println("COMPARATOR");
        Collections.sort(list, new Person());
        for (Person person4 : list) {
            System.out.println(person4);
        }

    }
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age.compareTo(o2.age);
    }

    Comparator<Person> comparator=new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getMobileNumber().compareTo(o2.getMobileNumber());
        }
    };


}
