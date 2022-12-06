package MyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyFile {
    File fileOnq = new File("PasswordOne.txt");
    PrintWriter pw;
    private String message;

    {
        try {
            pw = new PrintWriter(fileOnq);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void writer(String message) {
        pw.println(message);
        pw.close();
    }

}
