package com.work.File;

import java.io.File;
import java.io.FileFilter;

public class Filefilter_ implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
