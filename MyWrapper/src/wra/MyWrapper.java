package wra;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyWrapper implements Closeable {
    private final Socket socket;
    private final BufferedWriter writer;
    private final BufferedReader reader;

    public MyWrapper(String ip, int port) {
        try {
            this.socket = new Socket(ip, port);
            this.reader = creteReader();
            this.writer = createWriter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public MyWrapper(ServerSocket server) {
        try {
            this.socket = server.accept();
            this.reader = creteReader();
            this.writer = createWriter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeMessage (String message) {
        try {
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readMessage () {
        try {
           return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private BufferedReader creteReader() throws IOException {
            return new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    private BufferedWriter createWriter() throws IOException {
            return new BufferedWriter( new OutputStreamWriter(socket.getOutputStream()));

    }

    @Override
    public void close() throws IOException {
        writer.close();
        reader.close();
        socket.close();
    }
}
