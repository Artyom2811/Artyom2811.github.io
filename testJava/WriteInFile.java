package testJava;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public void write(String path, String text, boolean append) {
        //Создатся файл в корне проекта
        try (FileWriter writer = new FileWriter(path, append)) {
            // запись всей строки
            writer.write(text);
            //Если нужно добавить символ
//            writer.append('\n');

            //Если нужно добавить строку
//            writer.write("New row");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}