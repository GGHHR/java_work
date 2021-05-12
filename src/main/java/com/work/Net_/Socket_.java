package com.work.Net_;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Socket_ {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1", 8888);

        OutputStream os = socket.getOutputStream();

        os.write("2222".getBytes());
        socket.close();

    }
}
