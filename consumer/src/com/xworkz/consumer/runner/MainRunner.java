package com.xworkz.consumer.runner;

import com.xworkz.consumer.external.Vehicle;

import java.util.function.Consumer;

public class MainRunner {
    public static void main(String[] args) {
        Consumer<Integer> consumer=new Consumer<Integer>() {
            @Override
            public void accept(Integer price) {
                System.out.println("Consumer " + price);
            }
        };
        consumer.accept(560);
        Vehicle vehicle=new Vehicle() {
            @Override
            public void accept(Integer price) {
                System.out.println("Anonymous Class");
            }
        };
        vehicle.accept(345);
        Vehicle.start();
        vehicle.stop();
        Consumer<Integer> consumer1= integer-> System.out.println(integer);
        consumer1.accept(34);
    }
}
