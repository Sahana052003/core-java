package com.xworkz.collectionarchitre.Runner;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie=new Movie(45,"RRR",450D);
        Movie movie1=new Movie(12,"Bhabubali",500D);
        Movie movie2=new Movie(1,"Darling",200D);
        Movie movie3=new Movie(5,"Rebel",150D);
        Movie movie4=new Movie(72,"24",300D);
        Movie movie5 = new Movie(45,"RRR",450D);
//        TreeSet treeSet=new TreeSet<>();
//        treeSet.add(movie);
//        treeSet.add(movie1);
//        treeSet.add(movie2);
//        treeSet.add(movie3);
//        treeSet.add(movie4);
//        System.out.println(treeSet);


        Set<Movie> set = new HashSet<>();
        set.add(movie);
        set.add(movie1);
        set.add(movie2);
        set.add(movie3);
        set.add(movie4);
        System.out.println(set);

    }
}
