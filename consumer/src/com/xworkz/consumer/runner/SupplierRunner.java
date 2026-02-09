package com.xworkz.consumer.runner;

import com.xworkz.consumer.external.Pencil;

import java.util.function.Supplier;

public class SupplierRunner {
    public static void main(String[] args) {
        Supplier<Integer> supplier=new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 10;
            }
        };
        System.out.println(supplier.get());




        Pencil pencil = new Pencil() {
            @Override
            public Integer get() {
               // System.out.println("Cost is ");
                return 34;
            }
        };
        System.out.println(pencil.get());





        Supplier<Integer> supplier1=()->  56;
        System.out.println(supplier1.get());


        Supplier<Boolean> supplier2=()->null;
        System.out.println(supplier2.get());




    }
}