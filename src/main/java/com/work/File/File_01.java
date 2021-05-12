package com.work.File;

import java.io.File;
import java.io.IOException;

public class File_01 {
    public static void main(String[] args) {
        System.out.println("系统路径结束符"+File.pathSeparator);
        System.out.println("系统路径分隔符"+File.separator);
        System.out.println("绝对路径"+ new File("File_01.java").getAbsoluteFile());
        System.out.println("路径"+ new File("File_01.java").getPath());
        System.out.println("文件名带后缀"+ new File("D:\\guo\\java_\\File_01.java").getName());
        long aa = new File("E:\\Common\\CloudMusic\\cloudmusic.exe").length();
        System.out.println("文件大小"+ aa);

        System.out.println("文件存在不"+ new File("E:\\Common\\CloudMusic").getAbsoluteFile().exists());
        System.out.println("是文件夹不"+ new File("E:\\Common\\CloudMusic").isDirectory());
        System.out.println("是文件不"+ new File("aa.txt").isFile());


        try {
            System.out.println("创建文件"+ new File("./aa.txt").createNewFile());
            System.out.println("删除"+ new File("./aa.txt").delete());
//            System.out.println("创建文件夹"+ new File("./aa.txt").mkdir());
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] ab = new File("./").list();
        for (String fileName :ab){
            System.out.println();
            System.out.println(new File(fileName).isFile());

        }

        File[] abc = new File("./").listFiles((pathname)-> {
            return pathname.isFile() && pathname.getName().endsWith(".java");
        });
        for (File fileName :abc){
            System.out.println(fileName);

        }



        new File_01().aa();
    }


    public void aa() {
        File file = new File(this.getClass().getResource("/").getPath());
        System.out.println(file);
    }
}
