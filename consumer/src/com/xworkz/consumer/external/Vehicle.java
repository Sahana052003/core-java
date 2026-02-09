package com.xworkz.consumer.external;

@FunctionalInterface
public interface Vehicle {
    void accept(Integer price);
    public static void start(){
        System.out.println("Static ");
    }
    default void stop(){
        System.out.println("Vehicle default class");
    }
}
