package com.work.Net_;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket_ {
    public static void main(String[] args) throws IOException {
        ServerSocket ssot = new ServerSocket(8888);
        Socket socket = ssot.accept();

        InputStream is=socket.getInputStream();
        byte[] bytes = new byte[1024];

        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));

        socket.getOutputStream().write("111".getBytes());


        socket.close();
        ssot.close();
    }

}
