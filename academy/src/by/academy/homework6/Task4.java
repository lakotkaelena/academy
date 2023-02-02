package by.academy.homework6;

import java.io.*;
import java.util.Random;

public class Task4 {
    /*
    Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt).
     Считываем текст из 2-ого задания, получаем его длинну (576 символов).
      Для каждого файла генерируем рандомное число от 0 до 576, достаем из текста (из 2 задания)
      такое-же количество символов (string.substring()) и сохраняем в наш файл.
     Создайте файл result.txt и запишите туда список всех файлов и их размеры.
     */
    private static String text = "";
    private static final int COUNT = 100;

    public static void main(String[] args) throws IOException {
        File dir = new File("task4");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File fileResult = new File(dir, "result.txt");

        Random rand = new Random();

        try (BufferedReader readerFile = new BufferedReader(new FileReader("D:/проекты/academy/io/read.txt"));
             BufferedWriter writeResult = new BufferedWriter(new FileWriter(fileResult))) {
            String str;
            while ((str = readerFile.readLine()) != null) {
                text += str;
            }
            for (int i = 1; i <= COUNT; i++) {
                String name = i + ".txt";
                File file = new File(dir, name);
                if (!file.exists()) {
                    file.createNewFile();
                }
                BufferedWriter writerFile = new BufferedWriter(new FileWriter(file));
                writerFile.write(text, 0, rand.nextInt(text.length()));
                writerFile.close();
                writeResult.write("FileName: " + file.getName() + ", size: " + file.length() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
