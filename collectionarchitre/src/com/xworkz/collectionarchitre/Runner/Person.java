package com.xworkz.collectionarchitre.Runner;

public class Person implements Comparable<Person>{
    private Integer id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        //return this.age-o.age;
        return this.name.compareTo(o.name);
    }
}
