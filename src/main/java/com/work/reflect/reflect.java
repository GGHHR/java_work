package com.work.reflect;

import com.work.Random_;

import java.lang.reflect.Field;
import java.util.Arrays;

public class reflect {
    public static void main(String[] args) {
        Field[] fields= Random_.class.getDeclaredFields();
        for(Field f:fields){
            String name = f.getName();
            System.out.println(name);

            try {
                f.setAccessible(true);
                System.out.println( f.get("id").toString());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }


    }
}
