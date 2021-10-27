package com.bilibili.demo01;

public class Customer implements Runnable{
    private Noodle nd;

    public Customer(Noodle nd) {
        this.nd = nd;
    }

    @Override
    public void run() {
        while(nd.cnt > -1){
            synchronized (nd){
                if(nd.hasProduct){
                    System.out.println("开吃！");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("吃完了！");
                    nd.hasProduct = false;
                    System.out.println("再来一碗！");
                    System.out.println("---------------------------------");
                    nd.notify();
                    try {
                        nd.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("来碗招牌小面！");
                    nd.notify();
                    try {
                        nd.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
