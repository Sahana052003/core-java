package com.xworkz.predicate.external;

import com.xworkz.predicate.runner.Vehicle;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Car {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(3));
        System.out.println(isEven.test(8));

//        Vehicle vehicle=new Vehicle() {
//            int c=100;
//            @Override
//            public void start(int cost) {
//                System.out.println("Cost is : " + cost + " " + c);
//            }
//        };
//        vehicle.start(34);


//        Vehicle vehicle = cost -> {
//            int extraCost = 100;
//            System.out.println("Cost: " + cost + extraCost);
//        };
//vehicle.start(34);
//    }
    }
}