package com.xworkz.exception.main;

import java.lang.Exception;

//One try-block with n-number of catch blocks
public class MultiCatchBlock {
    public static void main(String[] args) {
        int num[] ={3,234,12,13};
        try{

            System.out.println(num[9]);
            int result=10/0;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception Occur");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfException is occurred");
        }catch (Exception e){
            System.out.println("Exception Occur");
        }
    }
}
