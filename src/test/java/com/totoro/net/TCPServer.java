package com.totoro.net;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author:totoro
 * @createDate:2023/2/2
 * @description:
 */
public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9002);
        Socket socket = server.accept();
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        while (true){
            String msg = in.readUTF();
            System.out.println("msg=" + msg);
            //返回消息给客户端
            String res = "你好，我是服务器";
            out.writeUTF(res);
        }

    }
}
