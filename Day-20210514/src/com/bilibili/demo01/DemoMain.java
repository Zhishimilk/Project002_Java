package com.bilibili.demo01;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

public class DemoMain {

    // Properties()  字符集
    // BufferedOutputStream()  字节输出流缓冲
    // BufferedInputStream()  字节读取流缓冲
    // BufferedWriter()  字符输出流缓冲
    // BufferedReader()  字符读取流缓冲
    // PrintStream()  打印流
    public static void main(String[] args) throws IOException {
        long l0 = System.currentTimeMillis();
        //-----------------------------------

        /*Properties pt = new Properties();

        *//*pt.setProperty("张三", "女");
        pt.setProperty("李四", "男");
        pt.setProperty("王五", "女");
        System.out.println(pt);
        pt.store(new FileWriter("C:\\Users\\zhish\\Desktop\\新建文本文档.txt"), "DD");*//*

        pt.load(new FileReader("C:\\Users\\zhish\\Desktop\\新建文本文档.txt"));

        System.out.println(pt);
        Set<String> keyNames = pt.stringPropertyNames();
        for (String key: keyNames) {
            System.out.println(key+"="+pt.getProperty(key));
        }*/

        //-----------------------------------

        /*FileOutputStream fos = new FileOutputStream("C:\\Users\\zhish\\Desktop\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("hell world".getBytes(StandardCharsets.UTF_8));
        bos.flush();
        bos.close();
        fos.close();*/

        //-----------------------------------

        /*FileInputStream fis = new FileInputStream("C:\\Users\\zhish\\Desktop\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }
        bis.close();
        fis.close();*/

        //-----------------------------------

        /*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\zhish\\Desktop\\新建文本文档.txt"), "utf-8");
        osw.write("你好,世界");
        osw.flush();
        osw.close();

        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("C:\\Users\\zhish\\Desktop\\新建文本文档2.txt"), "gbk");

        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\zhish\\Desktop\\新建文本文档.txt"), "utf-8");
        int len = 0;
        while((len = isr.read()) != -1){
            osw1.write(len);
        }
        isr.close();
        osw1.flush();
        osw1.close();*/

        //-----------------------------------

        System.out.println("DD");
        PrintStream ps = new PrintStream("C:\\Users\\zhish\\Desktop\\新建文本文档2.txt");
        System.setOut(ps);
        ps.println("dd");
        System.out.println("DD");

        //-----------------------------------
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l0+"mms");
    }
}
