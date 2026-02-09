package com.xworkz.consumer.runner;

import java.util.function.Function;

public class FunctionRunner {
    public static void main(String[] args) {
        Function<String,Integer> function=new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                System.out.println("Price is " + s);
                return 34;
            }
        };
        function.apply("3456");




        Function<Integer,Boolean> function1=n->n==0;
        System.out.println(function1.apply(0));


        Function<Integer,String> function2=q-> String.valueOf(q*q);
        System.out.println(function2.apply(3));
    }
}
