package com.bilibili.demo01;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class DemoMain {
    public static void main(String[] args) throws IOException {

        long l = System.currentTimeMillis();

        /*FileOutputStream fos = new FileOutputStream("C:\\Users\\zhish\\Desktop\\a.txt", true);

        new OutputStreamWriter(fos, "UTF-8");
        //public void write(byte[] b,int off ,int len)
        //public void write(byte[] b)
        //public void write(int b)
        //String -> byte[] getBytes()
        fos.write(98);
        fos.write(97);

        byte[] bt = {-69,-68,67};
        fos.write(bt);

        byte[] bt1 =  "你好世界".getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bt1));
        fos.write(bt1);

        fos.close();*/

        //---------------------------------------------------------

        /*FileInputStream fis = new FileInputStream("C:\\Users\\zhish\\Desktop\\新建文本文档.txt");

        *//*int len = fis.read();
        System.out.println(len);
        int len1 = fis.read();
        System.out.println(len1);
        int len2 = fis.read();
        System.out.println(len2);*//*
        int len = 0;
        byte[] bytes = new byte[3];

        while((len = fis.read(bytes)) != -1){

            System.out.print(len+": ");
            System.out.println(new String(bytes, 0, len));
        }

        fis.close();*/

        //---------------------------------------------------

        /*File file = new File("C:\\Users\\zhish\\Desktop\\dd.jpg");
        String name = file.getName();
        long length = file.length();
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("E:\\素材库\\"+name, true);

        int len = 0;
        byte[] bytes = new byte[(int)length];
        *//*while((len = fis.read()) != -1) {

        fos.write(len);
        }*//*

        len = fis.read(bytes);
        fos.write(bytes, 0, len-1);

        fos.close();
        fis.close();*/


        //-------------------------------------------------------

        /*File file = new File("C:\\Users\\zhish\\Desktop\\演讲稿.txt");
        FileReader fr = new FileReader(file);
        FileWriter fw = new FileWriter(file);

        int len = 0;
        char[] chs = new char[(int)file.length()];

        len = fr.read(chs);
        System.out.print(new String(chs, 0, len));

        fw.close();
        fr.close()*/

        //-------------------------------------------------------

        File file = new File("C:\\Users\\zhish\\Desktop\\dds.jpg");
        String name = file.getName();
        long length = file.length();

        try(FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream("E:\\素材库\\"+name);){

            int len = 0;
            byte[] bytes = new byte[(int)length];

            len = fis.read(bytes);
            fos.write(bytes, 0, len-1);

        }catch (IOException e){
            System.out.println(e);
        }

        //--------------------------------------------------------

        /*File file = new File("C:\\Users\\zhish\\Desktop\\dds.jpg");

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\素材库\\"+file.getName()));

        int len = 0;
        byte[] bytes = new byte[(int)file.length()];

        len = bis.read(bytes);
        bos.write(bytes, 0, len-1);

        bis.close();
        bos.close();*/

        //--------------------------------------------------------

        long l1 = System.currentTimeMillis();
        System.out.println(l1-l+"mms");
    }
}
