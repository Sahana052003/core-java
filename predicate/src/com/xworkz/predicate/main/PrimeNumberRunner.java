//package com.xworkz.predicate.main;
//
//import com.xworkz.predicate.internal.PrimeNumber;
//
//import java.util.function.Predicate;
//
//public class PrimeNumberRunner {
//    public static void main(String[] args) {
//        Predicate<Integer> num = value -> {
//            if (value <= 1) {
//                return false;
//            }
//            int count = 0;
//            for (int i = 1; i <= value; i++) {
//                if (value % i == 0)
//                    count++;
//            }
//                return count==2;
//        };
//                System.out.println(num.test(5));
//            }
//        }
