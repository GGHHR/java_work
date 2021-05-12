package com.work.thread;


public class Thread_{
    public static void main(String[] args) {
        Thread_1 Thread_a = new Thread_1();
        Thread Thread_1 = new Thread(Thread_a);
        Thread Thread_2 = new Thread(Thread_a);
        Thread Thread_3 = new Thread(Thread_a);
        Thread_1.start();
        Thread_2.start();
        Thread_3.start();

        /*lock_ Thread_a = new lock_();
        Thread Thread_1 = new Thread(Thread_a);
        Thread Thread_2 = new Thread(Thread_a);
        Thread Thread_3 = new Thread(Thread_a);
        Thread_1.start();
        Thread_2.start();
        Thread_3.start();*/


       new Thread(){
           @Override
           public void run() {
               System.out.println(1);
           }
       }.start();

       Runnable a= new Runnable() {
            @Override
            public void run() {
                System.out.println(2);
            }
        };
        new Thread(a).start();


        new Thread(()->{
            System.out.println("lambda");
        }).start();

    }

}
