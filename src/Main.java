import JavaCalculator.Calculator;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
//            ServerSocket serSocket = new ServerSocket(8000);
//            System.out.println("START SERVER");
//
//            Socket socket = serSocket.accept();
//            System.out.println("CLIENT CONNECTED");
//
//        BufferedWriter writer = new BufferedWriter(
//                new OutputStreamWriter(
//                        socket.getOutputStream()));
//        writer.write("Hello from SERVER");
//        writer.newLine();
//        writer.flush();
//
//        writer.close();
//        socket.close();
//        serSocket.close();

        Calculator infoValue = new Calculator();
        infoValue.infoCalculator();
    }
}