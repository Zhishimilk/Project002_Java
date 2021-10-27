package com.bilibili.demo02;

import java.io.*;
import java.util.ArrayList;

public class DemoMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        long l0 = System.currentTimeMillis();
        //-----------------------------------

        ArrayList<Person> psn = new ArrayList<>();
        psn.add(new Person("张三",18));
        psn.add(new Person("李四",19));
        psn.add(new Person("王五",20));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\zhish\\Desktop\\Person.txt"));
        oos.writeObject(psn);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\zhish\\Desktop\\Person.txt"));
        Object o = ois.readObject();
        ois.close();
        ArrayList<Person> al = (ArrayList<Person>) o;
        System.out.println(al);

        //-----------------------------------
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l0+"mms");
    }
}
