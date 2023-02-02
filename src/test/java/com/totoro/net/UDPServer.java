package com.totoro.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author:totoro
 * @createDate:2023/2/2
 * @description:
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(9001);
        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);

        System.out.println("server ready go.....");

        while (true){
            socket.receive(packet);
            String info = new String(data, 0, packet.getLength());
            System.out.println("客户端发来的消息:"+info);

            InetAddress address = packet.getAddress();
            int port = packet.getPort();
            String res = "你好，我是服务器";
            DatagramPacket packet1 = new DatagramPacket(res.getBytes(), res.getBytes().length, address, port);
            socket.send(packet1);
        }
    }
}
