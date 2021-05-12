package com.work;

import java.util.Random;

public class Random_ {
     public int id=1;


    public static void main(String[] args) {
        random();
    }

    static void random() {
        Random a=new Random();
        System.out.println(a.nextInt(2));

    }
}
