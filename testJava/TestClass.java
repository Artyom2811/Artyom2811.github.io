package testJava;

import java.io.IOException;

public class TestClass {
    public static void main(String[] args) throws IOException {
        WriteInFile writeInFile = new WriteInFile();
        writeInFile.write("test.txt", "ABC", false);
        ReadFromFile readFromFile = new ReadFromFile();
        String answer = readFromFile.read("test.txt");
        System.err.println(answer);
    }
}

