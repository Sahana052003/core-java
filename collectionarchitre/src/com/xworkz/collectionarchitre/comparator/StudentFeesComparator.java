package com.xworkz.collectionarchitre.comparator;

import java.util.Comparator;

public class StudentFeesComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.fees.compareTo(o2.fees);
    }

}
