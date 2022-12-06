import MyFile.MyFile;
import wra.MyWrapper;
import java.io.*;
import java.net.ServerSocket;


public class Main {
    public static void main(String[] args) {
        try ( ServerSocket serSocket = new ServerSocket(8000))
        {
            System.out.println("START SERVER");

            while (true)
                try ( MyWrapper myWrapper = new MyWrapper(serSocket)) {
                    String request = myWrapper.readMessage();
                    System.out.println("Request " + request);
                    String response = (int) (Math.random() * 10 -10) + "";
                    myWrapper.writeMessage(response);
                    System.out.println("Response: " + response);
                } catch (NullPointerException e) {
                    e.printStackTrace();

                }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        MyFile d = new MyFile();
//        d.writer("Hello world");
    }
}