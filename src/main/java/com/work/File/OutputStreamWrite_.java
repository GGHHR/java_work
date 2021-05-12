package com.work.File;

import java.io.*;

public class OutputStreamWrite_ {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./a.txt"), "utf-8");
        osw.write("2322");
        osw.flush();
        osw.close();
    }
}
