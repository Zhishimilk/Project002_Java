package com.bilibili.demo01;

public class DemoMain {

    public static void main(String[] args) {

        Object obj = new Object();

        new Thread(){

            @Override
            public void run(){
                synchronized(obj){

                    System.out.println("action");
                    try {
                        Thread.sleep(3000);
                        System.out.println("DD");
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("received");
                }

                System.out.println("over");
            }
        }.start();

        new Thread(){

            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("finish");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("GO");
                    obj.notify();
                    System.out.println("pp");
                }
                System.out.println("pp");
            }
        }.start();

        new Runnable(){

            @Override
            public void run() {

            }
        };
    }
}
