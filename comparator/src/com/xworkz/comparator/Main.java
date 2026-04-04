package com.xworkz.comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(23, "pen", 300.89, false);
        Product product1 = new Product(8, "chains", 500D, true);
        Product product2 = new Product(78, "keyboard", 1500D, true);
        Product product3 = new Product(36, "Mobile", 50000D, true);
        Product product4 = new Product(12, "headphones", 1000D, false);


        List<Product> list = new ArrayList<>();
        list.add(product);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        //Collections.sort(list);
        //System.out.println(list);


        //set and get the product
        list.get(4).setPrice(500D);
        System.out.println(list);

        Map<String,Product> map=new HashMap<>();
//        for (Product p:list){
//            map.put(p.getProductName(),p);
//            System.out.println(p);
//        }
//
//        map.get("keyboard").setPrice(45652D);
//        System.out.println(map);
//    }




        Collections.sort(list,new ProductNameComparator());
        System.out.println(list);

        System.out.println("-------------------------");

        Collections.sort(list,new ProductPriceComparator());
        System.out.println(list);


        System.out.println("+++++++++++++++++++");
        Collections.sort(list,new ProductAvailableComparator());
        System.out.println(list);


        for (Product p : list) {
            map.put(p.getProductName(), p);
        }
        System.out.println("Traversal");
        for (Map.Entry<String,Product> entry1:map.entrySet()){
            System.out.println(entry1.getKey() + " and " + entry1.getValue());
        }
        }

    }

