import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serSocket = new ServerSocket(8000);
        System.out.println("START SERVER");
        serSocket.accept();
        System.out.println("CLIENT CONNECTED");
    }

}