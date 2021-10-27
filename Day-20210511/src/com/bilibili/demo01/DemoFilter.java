package com.bilibili.demo01;

import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

public class DemoFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {

        if(pathname.isDirectory()){
            return true;
        }

        return pathname.getName().toLowerCase(Locale.ROOT).endsWith(".jpg");
    }
}
