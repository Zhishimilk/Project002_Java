package com.bilibili.demo01;

public class RunnableDemo01 implements Runnable {
    @Override
    public void run() {

        System.out.println("hi "+Thread.currentThread().getName());
    }
}
