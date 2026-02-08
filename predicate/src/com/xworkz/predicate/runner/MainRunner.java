package com.xworkz.predicate.runner;//package com.xworkz.predicate.runner;
//
//import com.xworkz.predicate.internal.Payment;
//
//import java.util.function.Predicate;
//
//public class MainRunner {
//    public static void main(String[] args) {

import com.xworkz.predicate.internal.Book;

////        Predicate<Boolean> isPaid=new Predicate<Boolean>() {
////            @Override
////            public boolean test(Boolean isCredited) {
////                System.out.println("Calling this Method" + isCredited);
////                return isCredited!=null&&isCredited;
////            }
////        };
////        boolean resi=isPaid.test(false);
////        System.out.println(resi);
//        Payment status=(isCredited )-> {
//            System.out.println("Checking status");
//            return isCredited;
//        };
//        boolean result=status.test(true);
//        System.out.println(result);
//    }
//}




public class MainRunner{
    public static void main(String[] args) {
//        Book book=new Book() {
//            @Override
//            public void discount(int price) {
//                System.out.println("Price is " + price);
//            }
//        };
//        book.discount(34);
//    }



//        Book book=price -> System.out.println(price);
//        book.discount(56);


//        Book book= price-> price;
//        Integer discount = book.discount(77);
//        System.out.println(discount);


        Book book=( price,  pages)-> price + pages;
        Integer discount = book.discount(3, 8);
        System.out.println(discount);
            }
    }
