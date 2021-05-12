package com.work.File;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        InputStreamReader osw = new InputStreamReader(new FileInputStream("./a.txt"), "utf-8");

        BufferedReader br = new BufferedReader(osw);
        String len;
        while ((len= br.readLine())!=null){
            System.out.println(len);
        }







        osw.close();
    }
}
