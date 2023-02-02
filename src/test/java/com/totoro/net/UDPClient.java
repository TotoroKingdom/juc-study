package com.totoro.net;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @author:totoro
 * @createDate:2023/2/2
 * @description:
 */
public class UDPClient {
    public static void main(String[] args) throws IOException {

        InetAddress address = InetAddress.getByName("localhost");
        int port = 9001;
        while (true){
            Scanner scanner = new Scanner(System.in);
            String send = scanner.nextLine();
            byte[] data = send.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
            DatagramSocket socket = new DatagramSocket();
            socket.send(packet);

            byte[] data2 = new byte[1024];
            DatagramPacket packet1 = new DatagramPacket(data2, data2.length);
            socket.receive(packet1);

            String reply = new String(data2, 0, packet1.getLength());
            System.out.println("服务器响应数据：" + reply);
            socket.close();
        }
    }
}
