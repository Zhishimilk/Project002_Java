package com.bilibili.demo01;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Locale;

public class DemoMain {
    public static void main(String[] args) throws IOException {

        /*String file =  File.pathSeparator;
        System.out.println(file);

        String file01 = File.separator;
        System.out.println(file01);*/

        /*
        File(File parent, String child)
        创建从一个家长的抽象路径名和一个孩子的路径字符串的新 File实例。
        File(String pathname)
        通过将给定的路径名的字符串转换成一个抽象路径名创建一个新的 File实例。
        File(String parent, String child)
        创建从父路径名的字符串和一个孩子的一个新的 File实例文件。

        boolean delete()
        删除文件或目录的路径名表示的抽象。
        boolean exists()
        检查文件或目录是否存在这种抽象路径名记。
        File getAbsolutePath()
        返回此抽象路径名的绝对路径名的字符串。
        String getName()
        返回的名称的文件或目录的路径名表示的抽象。
        long length()
        返回文件的大小。
        boolean mkdirs()
        创建该目录下的抽象路径名命名，包括任何必要的但不存在父目录。
        String[] list()
        返回的字符串在该目录下的抽象路径名的文件和目录命名为数组。
        String[] list(FilenameFilter filter)
        返回的字符串在该目录下的抽象路径名，满足指定的过滤器表示文件和目录命名数组。
        File[] listFiles()
        返回表示抽象路径名的目录中的文件的路径名表示抽象的数组。
        File[] listFiles(FileFilter filter)
        返回表示的抽象路径名的文件和目录的目录，这个抽象路径名满足指定过滤器表示数组。
        File[] listFiles(FilenameFilter filter)
        返回表示的抽象路径名的文件和目录的目录，这个抽象路径名满足指定过滤器表示数组。

        */


        File file = new File("E:\\素材库\\图片素材");
        method3(file);

        /*System.out.println(new File("G:\\下载\\Comic").length());
        File file = new File("C:\\Users\\zhish\\Desktop\\a.txt");
        file.createNewFile();*/

    }

    public static void method(File file){
        for (File lastFile : file.listFiles(new DemoFilter())) {
            if(lastFile.isDirectory()){
                method(lastFile);
            }else {
                //String getName();
                //String getPath();
                //String toString();
                System.out.println(lastFile);
            }
        }
    }

    public static void method1(File file){
        for (File lastFile : file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase(Locale.ROOT).endsWith(".jpg");
            }
        })) {
            if(lastFile.isDirectory()){
                method1(lastFile);
            }else {
                System.out.println(lastFile);
            }
        }
    }

    public static void method2(File file){
        for (File lastFile : file.listFiles((pathname)->{ return pathname.isDirectory() || pathname.getName().toLowerCase(Locale.ROOT).endsWith(".jpg"); })) {
            if(lastFile.isDirectory()){
                method2(lastFile);
            }else {
                System.out.println(lastFile);
            }
        }
    }

    public static void method3(File file){
        for (File lastFile : file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() || name.toLowerCase(Locale.ROOT).endsWith(".jpg");
            }
        })) {
            if(lastFile.isDirectory()){
                method3(lastFile);
            }else {
                System.out.println(lastFile);
            }
        }
    }
}
