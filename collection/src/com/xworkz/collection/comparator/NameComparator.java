package com.xworkz.collection.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<LaptopComparator> {

    @Override
    public int compare(LaptopComparator o1, LaptopComparator o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
