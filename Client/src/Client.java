import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        try (
             Socket clientSocket = new Socket("127.0.0.1", 8000);
             BufferedWriter writer =
                     new BufferedWriter(
                        new OutputStreamWriter(
                            clientSocket.getOutputStream()));
             BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    clientSocket.getInputStream()));
        ) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
