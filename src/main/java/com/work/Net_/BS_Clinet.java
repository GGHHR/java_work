package com.work.Net_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BS_Clinet {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();

        /*  int len = 0;
        byte[] bytes = new byte[1024];
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }*/

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        System.out.println(br.readLine());
    }
}
