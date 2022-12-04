import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try ( ServerSocket serSocket = new ServerSocket(8000))
        {
            System.out.println("START SERVER");

            while (true)
                try (
                        Socket socket = serSocket.accept();

                        BufferedWriter writer = new BufferedWriter(
                                new OutputStreamWriter(
                                        socket.getOutputStream()));
                        BufferedReader reader =
                                new BufferedReader(
                                        new InputStreamReader(
                                                socket.getInputStream()));
                )  {
                    String request = reader.readLine();
                    System.out.println("Request " + request);
                    String response = ("Hello from SERVER " + request.length());
                    System.out.println("Response: " + response);
                    System.out.println(response);
                    writer.write(response);
                    writer.newLine();
                    writer.flush();
                }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}