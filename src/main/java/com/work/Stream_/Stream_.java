package com.work.Stream_;

import org.jetbrains.annotations.TestOnly;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream_ {


    public static void main(String[] args) {
       /*
        Random random = new Random();
        random.ints().limit(1).forEach(System.out::println);
        System.out.println(random.ints().limit(2).max().getAsInt());*/

        stream_arr();
        stream_arraysList();
    }
    /**
     *Arrays
     * */
    public static void stream_arr() {
        int[] a = {0, 3, 6, 9, 4, 3};
 
        Arrays.stream(a)
                .distinct()
                .sum();

        System.out.println( Arrays.stream(a)
                .distinct()
                .sum());

        System.out.println("-----stream_arr-----");
    }
    /**
     *ArrayList
     * */
    public static void stream_arraysList() {
        ArrayList<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("1111");
        list.stream().filter(name -> name == "1");
        list.forEach(System.out::println);
    }



}

