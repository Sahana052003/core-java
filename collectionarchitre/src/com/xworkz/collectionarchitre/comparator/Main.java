package com.xworkz.collectionarchitre.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Student student=new Student(34,"Sora",456789.23D);
        Student student1=new Student(1,"Karthik",9876D);
        Student student2=new Student(45,"Muktha",345.2134D);
        Student student3=new Student(7,"NanduShree",56337D);
        List<Student> list=new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,new StudentEmailComparator());
        System.out.println(list);

        Collections.sort(list,new StudentFeesComparator());
        System.out.println(list);
    }
}
