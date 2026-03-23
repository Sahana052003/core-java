package com.xworkz.collectionarchitre.main;

import java.util.HashMap;
import java.util.Map;

public class VehicleRunner {
    public static void main(String[] args) {
        Map<Vehicle,Integer> map=new HashMap<>();
        Vehicle vehicle=new Vehicle("Toyota",432);
        Vehicle vehicle1=new Vehicle("Honda",876);
        Vehicle vehicle2=new Vehicle("suzuki",876);
        Vehicle vehicle3=new Vehicle("Toyota",432);

        map.put(vehicle,3456);
        map.put(vehicle1,2345);
        map.put(vehicle2,1234);
        map.put(vehicle,23456);
        System.out.println(map);


    }
}

