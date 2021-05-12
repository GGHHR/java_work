package com.work.File;

import java.io.*;
import java.net.URL;

public class Stream_ {
    public static void main(String[] args) throws IOException {

            FileOutputStream fos= new FileOutputStream("a.txt");
            byte[] aa = {97,98,99, 100};
            byte[] ab = "3333".getBytes();
            fos.write( aa);
            fos.write( ab);
            fos.close();



            /* ��ȡ����ֽ�*/
            FileInputStream fis= new FileInputStream("a.txt");
            byte[] by = new byte[1024];
            int len=0;

            while ((len=fis.read(by))!=-1){
                System.out.println(new String(by,0,len));
            }

            url();
    }

    public static void url() throws IOException {

        URL url = new URL("http://www.baidu.com");

        InputStream is = url.openStream();

        InputStreamReader isr = new InputStreamReader(is, "utf-8");

        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
