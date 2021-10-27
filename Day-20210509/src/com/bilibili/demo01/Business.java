package com.bilibili.demo01;

public class Business implements Runnable{
    private Noodle nd;

    public Business(Noodle nd) {
        this.nd = nd;
    }

    @Override
    public void run() {
        while (nd.cnt-- > 0){
            synchronized (nd){
                if(nd.hasProduct){
                    try {
                        nd.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(nd.cnt%2 == 0) {
                    nd.soup = "红汤";
                    nd.width = "细面";
                }else {
                    nd.soup = "清汤";
                    nd.width = "韭页";
                }
                nd.hasProduct = true;
                System.out.println(nd.soup+nd.width+"小面来了");
                nd.notify();
            }
        }
    }
}
