package com.xworkz.comparable.main;

import com.xworkz.comparable.external.Car;
import com.xworkz.comparable.internal.Vehicle;

public class MainRunner {
    public static void main(String[] args) {
        Car car=new Car();
        car.start();
        ((Vehicle)(car)).start();



    Vehicle v=new Car();
    Car c=new Car();
    System.out.println(c.x);
}
}
