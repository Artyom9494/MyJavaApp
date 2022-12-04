import wra.MyWrapper;
import java.io.*;


public class Client {
    public static void main(String[] args) {

        try ( MyWrapper myWrapper = new MyWrapper("127.0.0.1", 8000)) {
            System.out.println("Connected ti server");

            String request = "Krasnodar";
            System.out.println("Request: " + request);
            myWrapper.writeMessage(request);

            String responds = myWrapper.readMessage();
            System.out.println("Responds: " + responds);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
