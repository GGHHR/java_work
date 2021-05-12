package com.work.thread;

public class Thread_1 implements  Runnable{
    int num=100;
    static int num1=100;

    public static void main(String[] args) {

    }
    @Override
    public void run() {
        synchronized (this){
            while (true){
                if(num>0){
                    num--;
                    System.out.println( num);
                }else{
                    break;
                }
            }
        }
    }
    synchronized void  aa() {

        while (true){
            if(num>0){
                System.out.println("ʣ�ࣺ"+num);
                System.out.println("ʣ�ࣺ"+Thread.currentThread().getName());
                num--;
            }else{
                break;
            }
        }
    }

    /*��̬����������ʱ�����class����*/
    public static synchronized void  ab() {
        while (true){


            if(num1>0){
                System.out.println("ʣ�ࣺ"+num1);
                num1--;
            }
        }
    }
}
