package com.xworkz.exception.main;

import java.lang.Exception;

//Nested Try Catch Block ->Have one try block inside that it have n-no of try -catchblock
public class NestedTryCatch {
    public static void main(String[] args) {
       try{
           int[] num={1,6,2,4};
           System.out.println("Numbers are ");
           try{
               int result=num[6]/0;
           }catch (Exception e){
               System.out.println("Arithmetic Exception Occurred");
           }
           System.out.println(num[5]);
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("access out of zindex value");
       }

    }
}
