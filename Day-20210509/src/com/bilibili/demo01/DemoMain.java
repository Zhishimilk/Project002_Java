package com.bilibili.demo01;

public class DemoMain {

    public static void main(String[] args) {

        Noodle nd = new Noodle();

        new Thread(new Customer(nd)).start();
        new Thread(new Business(nd)).start();
    }
}
