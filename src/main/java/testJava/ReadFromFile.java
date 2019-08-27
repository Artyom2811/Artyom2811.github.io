package testJava;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadFromFile {
    public String read(String path) {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(path)) {
            char[] buf = new char[4096];
            int c;
            while ((c = reader.read(buf)) > 0) {

                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                sb.append(buf);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return sb.toString();
    }
}