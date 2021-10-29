package testJava;


import jxl.read.biff.BiffException;
import jxl.write.WriteException;

import java.io.IOException;
import java.util.*;

public class TestClass {

    public static void main(String[] args) throws IOException, BiffException, WriteException {
        LinkedHashSet <String> books = new LinkedHashSet<>();
        books.add(null);
        books.add("1");
        books.add("2");

        books.forEach(System.out::print);





        System.out.println("Start");

        Map <String, String> books1 = new HashMap<>();
        books1.put(null, null);
        books1.put(null, "A");
        books1.put("Война и мир", "Лев Толстой");
        books1.put("Война и мир", "Лев Толстой");

        books1.forEach((a,b) -> System.out.println("Название книги: " + a + ". Автор: " + b));

        System.out.println("End");


//        WriteInFile writeInFile = new WriteInFile();
//        writeInFile.write("test.txt", "ABC", false);
//        ReadFromFile readFromFile = new ReadFromFile();
//        String answer = readFromFile.read("test.txt");
//        System.err.println(answer);

//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        WritableWorkbook myFirstWbook = Workbook.createWorkbook(outputStream);
//        WritableSheet excelSheet = myFirstWbook.createSheet("Sheet 1", 0);
//
//        // add something into the Excel sheet
//        Label label = new Label(0, 0, "Test Count");
//        excelSheet.addCell(label);
//        myFirstWbook.write();
//        myFirstWbook.close();
//
//        InputStream inputStream = new ByteArrayInputStream(((ByteArrayOutputStream) outputStream).toByteArray());
//        Workbook mySecondWbook = Workbook.getWorkbook(inputStream);
//        System.err.println(mySecondWbook.getSheet(0).getCell(0, 0).getContents());
    }
}

