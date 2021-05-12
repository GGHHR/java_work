package com.work.thread;

public class RunnableDemo1 {
    public static void main(String[] args) {


        aa(() -> {
            System.out.println(123);
        });

        new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
        }).start();
    }
    static  void  aa(Cook cook){
        cook.makeFood();
    }
}
