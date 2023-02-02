package com.totoro.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author:totoro
 * @createDate:2023/2/2
 * @description:
 */
public class TCPClient {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 9002);

        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        while (true){
            String send = scanner.nextLine();
            out.writeUTF(send);

            String msg = in.readUTF();
            System.out.println("msg=" + msg);

        }
    }


}
