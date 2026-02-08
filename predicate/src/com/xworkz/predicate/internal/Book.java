package com.xworkz.predicate.internal;

@FunctionalInterface
public interface Book {
    Integer discount(int price,int pages);
}
