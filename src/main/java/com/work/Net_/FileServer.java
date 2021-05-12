package com.work.Net_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ssot = new ServerSocket(8888);
        Socket socket = ssot.accept();
        InputStream is=socket.getInputStream();
        FileOutputStream file = new FileOutputStream("./aa.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=is.read(bytes))!=-1){
            file.write(bytes,0,len);
        }



        OutputStream os = socket.getOutputStream();
        os.write("nihao".getBytes());

        file.close();
        socket.close();
        ssot.close();
    }
}
