package by.academy.homework6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    /*
    Создать руками текстовый файл, закинуть следующий текст:
    Создать новый файл result.txt.
    Программно считать файл с текстом, удалить все пробелы и записать полученный текст в result.txt.
     */
    public static String replaceChar = " ";

    public static void main(String[] args) {
        File fileResult = new File("result.txt");
        if (fileResult.exists()) {
            fileResult.mkdirs();
        }
        try (FileReader reader = new FileReader("D:/проекты/academy/io/read.txt");
             FileWriter writer = new FileWriter(fileResult)) {
            int c;
            while ((c = reader.read()) != -1) {
                if (replaceChar.contains(Character.valueOf((char) c).toString())) {
                    writer.write("");
                } else {
                    writer.write((char) c);
                }
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
