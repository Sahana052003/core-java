package com.xworkz.comparator.runner;

import java.util.Comparator;

public class ProductAvailableComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getAvailable().compareTo(o2.getAvailable());
    }
}
