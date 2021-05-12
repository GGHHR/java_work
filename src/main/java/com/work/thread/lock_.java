package com.work.thread;
import lombok.Synchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lock_ implements Runnable {

    int num=100;
    static int num1=100;

    Lock lock_1 = new ReentrantLock();

    public static void main(String[] args) {
        lock_ lock_ = new lock_();
        new Thread(lock_).start();
        new Thread(lock_).start();
        new Thread(lock_).start();
    }

    @Override
    public void run() {
        lock_1.lock();
        while (true){
            if(num>0){
                System.out.println(num);
                num--;
            }else{
                break;
            }
        }
        lock_1.unlock();
    }
}
