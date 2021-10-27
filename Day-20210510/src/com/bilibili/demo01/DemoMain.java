package com.bilibili.demo01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoMain {

    public static void main(String[] args) {

        /*ExecutorService et =  Executors.newFixedThreadPool(3);
        et.submit(new RunnableDemo01());
        et.submit(new RunnableDemo01());
        et.submit(new RunnableDemo01());
        et.submit(new RunnableDemo01());
        et.shutdown();*/
        /*new Thread(()->{ System.out.println(Thread.currentThread().getName()); }).start();*/

        PersonDemo01[] pd = new PersonDemo01[3];
        pd[0] = new PersonDemo01("李四",19);
        pd[1] = new PersonDemo01("王五",20);
        pd[2] = new PersonDemo01("张三",18);

        for (PersonDemo01 dd:
                pd) {
            System.out.println(dd);
        }
        System.out.println("----------------------------------------");

        /*Arrays.sort(pd, new Comparator<PersonDemo01>() {
            @Override
            public int compare(PersonDemo01 o1, PersonDemo01 o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        Arrays.sort(pd, (PersonDemo01 o1, PersonDemo01 o2)->{ return o1.getAge() - o2.getAge(); });

        for (PersonDemo01 dd:
             pd) {
            System.out.println(dd);
        }



    }
}
