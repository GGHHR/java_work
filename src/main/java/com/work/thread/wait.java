package com.work.thread;

public class wait {
    public static void main(String[] args) {
        Object aa = new Object();
        new Thread(){
            @Override
            public void run() {
                    synchronized (aa) {
                        try {
                            System.out.println("1 ");
                            aa.wait();
                            System.out.println("2 ");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                    synchronized (aa) {
                        try {
                            System.out.println("3");
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        aa.notify();
                    }

            }
        }.start();
    }
}
