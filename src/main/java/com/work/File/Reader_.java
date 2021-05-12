package com.work.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader_ {
    public static void main(String[] args) throws IOException {
        FileReader rd = new FileReader("a.txt");
        FileWriter rw = new FileWriter("a.txt");

        rw.write("22222");
        rw.flush();
        rw.close();



        BufferedReader br = new BufferedReader(rd);


        String str;
        while ((str= br.readLine())!=null){
            System.out.println(str);
        }



    }
}
