package com.xworkz.consumer.external;

@FunctionalInterface
public interface Pen <String ,Integer >{
    String apply(Integer price);
}
