package com.work.Function;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Function {
    /*Supplier*/
    static void aa(Supplier aa) {
        System.out.println(aa.get());
    }

    /*IntSupplier*/
    static void ab(IntSupplier aa) {
        System.out.println(aa.getAsInt());
    }
    public static void main(String[] args) {
        aa(()->{
            return 0;
        });

        ab(()->{
            return 1;
        });


    }
}
