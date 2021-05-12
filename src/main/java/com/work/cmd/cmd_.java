package com.work.cmd;

import java.io.IOException;

public class cmd_ {
    public static void main(String[] args) throws IOException {
        Runtime run = Runtime.getRuntime();
        Process aa=run.exec("cmd /k start");
        Process calc=run.exec("calc");

        System.out.println(aa.isAlive());
        System.out.println(aa.getInputStream());
    }
}
