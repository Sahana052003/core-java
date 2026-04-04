package com.xworkz.collectionarchitre.comparator;

public class Student implements Comparable<Student> {
    private Integer id;
    String name;
     Double fees;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                '}';
    }

    public Student(Integer id, String name, Double fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
