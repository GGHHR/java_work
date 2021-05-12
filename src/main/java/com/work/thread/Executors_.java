package com.work.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_ {
    public static void main(String[] args) {
        ExecutorService threadPool=  Executors.newFixedThreadPool(2);
        try {
            for (int i = 0; i < 10; i++){
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"你好");
                });
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
